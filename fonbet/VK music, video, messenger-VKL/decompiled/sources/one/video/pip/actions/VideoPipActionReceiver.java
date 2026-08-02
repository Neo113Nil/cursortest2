package one.video.pip.actions;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import one.video.pip.playback.PipPlaybackAction;
import xsna.epa0;
import xsna.epx;

/* compiled from: VideoPipActionReceiver.kt */
/* loaded from: classes8.dex */
public final class VideoPipActionReceiver extends BroadcastReceiver {
    public final epa0 a;

    /* compiled from: VideoPipActionReceiver.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoPipActionType.values().length];
            try {
                iArr[VideoPipActionType.PLAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoPipActionType.PAUSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoPipActionType.REPLAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VideoPipActionType.SEEK_FORWARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VideoPipActionType.SEEK_BACKWARD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[VideoPipActionType.SKIP_FORWARD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[VideoPipActionType.SKIP_BACK.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[VideoPipActionType.SEEK_FORWARD_DISABLED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[VideoPipActionType.SEEK_BACKWARD_DISABLED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public VideoPipActionReceiver(epa0 epa0Var) {
        this.a = epa0Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (epx.f(intent.getAction(), "VideoPipActionReceiver:intent_action")) {
            Bundle extras = intent.getExtras();
            Object obj = null;
            String string = extras != null ? extras.getString("VideoPipActionReceiver:intent_extra_action_type") : null;
            Iterator<E> it = VideoPipActionType.h().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (epx.f(((VideoPipActionType) next).name(), string)) {
                    obj = next;
                    break;
                }
            }
            VideoPipActionType videoPipActionType = (VideoPipActionType) obj;
            int i = videoPipActionType == null ? -1 : a.$EnumSwitchMapping$0[videoPipActionType.ordinal()];
            epa0 epa0Var = this.a;
            switch (i) {
                case -1:
                case 7:
                case 8:
                case 9:
                    return;
                case 0:
                default:
                    throw new NoWhenBranchMatchedException();
                case 1:
                    epa0Var.a(PipPlaybackAction.PLAY);
                    return;
                case 2:
                    epa0Var.a(PipPlaybackAction.PAUSE);
                    return;
                case 3:
                    epa0Var.a(PipPlaybackAction.REPLAY);
                    return;
                case 4:
                    epa0Var.a(PipPlaybackAction.SEEK_FORWARD);
                    return;
                case 5:
                    epa0Var.a(PipPlaybackAction.SEEK_BACKWARD);
                    return;
                case 6:
                    epa0Var.a(PipPlaybackAction.SKIP_FORWARD);
                    return;
            }
        }
    }
}
