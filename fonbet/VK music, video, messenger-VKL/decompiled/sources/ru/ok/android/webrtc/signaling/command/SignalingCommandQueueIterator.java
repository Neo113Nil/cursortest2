package ru.ok.android.webrtc.signaling.command;

import java.util.List;
import org.json.JSONException;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.signaling.command.SignalingCommandQueueIterator.CommandsQueueItem;
import xsna.wzs;

/* loaded from: classes9.dex */
public class SignalingCommandQueueIterator<C extends CommandsQueueItem> {

    @Deprecated
    public static final String TAG = "SignalingCommandQueueIterator";
    public final List a;
    public final RTCLog b;
    public final wzs c;
    public int d;

    public SignalingCommandQueueIterator(List<C> list, RTCLog rTCLog, wzs<? super SignalingCommand, ? super Long, ? extends C> wzsVar) {
        this.a = list;
        this.b = rTCLog;
        this.c = wzsVar;
        this.d = list.size();
    }

    public static final String commandToString(SignalingCommand signalingCommand) {
        try {
            return signalingCommand.extractParams().optString("command");
        } catch (JSONException unused) {
            return "";
        }
    }

    public final List<C> getList() {
        return this.a;
    }

    public final RTCLog getLog() {
        return this.b;
    }

    public final boolean hasNext() {
        return this.d > 0;
    }

    public final C next() throws IndexOutOfBoundsException {
        int i = this.d;
        if (i <= 0) {
            throw new IndexOutOfBoundsException("No more elements in the list");
        }
        int i2 = i - 1;
        this.d = i2;
        return (C) this.a.get(i2);
    }

    public final boolean replace(SignalingCommand signalingCommand) {
        String str;
        CommandsQueueItem commandsQueueItem = (CommandsQueueItem) this.a.get(this.d);
        CommandsQueueItem commandsQueueItem2 = (CommandsQueueItem) this.c.invoke(signalingCommand, Long.valueOf(commandsQueueItem.getSeq()));
        if (commandsQueueItem2 == null) {
            return false;
        }
        try {
            commandsQueueItem.onDiscard();
        } catch (Throwable th) {
            RTCLog rTCLog = this.b;
            try {
                str = commandsQueueItem.getCommand().extractParams().optString("command");
            } catch (JSONException unused) {
                str = "";
            }
            rTCLog.logException(TAG, "Error on discard command " + str, th);
        }
        this.a.set(this.d, commandsQueueItem2);
        return true;
    }

    public static class CommandsQueueItem {
        public final SignalingCommand a;
        public final long b;

        public CommandsQueueItem(SignalingCommand signalingCommand, long j) {
            this.a = signalingCommand;
            this.b = j;
        }

        public final SignalingCommand getCommand() {
            return this.a;
        }

        public long getSeq() {
            return this.b;
        }

        public void onDiscard() {
        }
    }
}
