package ru.ok.android.webrtc.signaling.command.merge;

import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.webrtc.signaling.command.SignalingCommand;
import ru.ok.android.webrtc.signaling.command.SignalingCommandChangeMediaModifiers;
import ru.ok.android.webrtc.signaling.command.SignalingCommandChangeMediaSettings;
import ru.ok.android.webrtc.signaling.command.SignalingCommandQueueIterator;
import xsna.epx;
import xsna.zcl;

/* loaded from: classes9.dex */
public class SignalingCommandMerge {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public Companion(zcl zclVar) {
        }

        public final SignalingCommandMerge create(SignalingCommand signalingCommand) {
            if (signalingCommand instanceof SignalingCommandChangeMediaSettings) {
                return new MergeCommandChangeMediaSettings((SignalingCommandChangeMediaSettings) signalingCommand);
            }
            if (signalingCommand instanceof SignalingCommandChangeMediaModifiers) {
                return new MergeCommandChangeMediaModifiers((SignalingCommandChangeMediaModifiers) signalingCommand);
            }
            return null;
        }
    }

    public interface Result {

        public static final class Append implements Result {
            public final SignalingCommand a;

            public Append(SignalingCommand signalingCommand) {
                this.a = signalingCommand;
            }

            public static /* synthetic */ Append copy$default(Append append, SignalingCommand signalingCommand, int i, Object obj) {
                if ((i & 1) != 0) {
                    signalingCommand = append.a;
                }
                return append.copy(signalingCommand);
            }

            public final SignalingCommand component1() {
                return this.a;
            }

            public final Append copy(SignalingCommand signalingCommand) {
                return new Append(signalingCommand);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Append) && epx.f(this.a, ((Append) obj).a);
            }

            public final SignalingCommand getCommand() {
                return this.a;
            }

            public int hashCode() {
                return this.a.hashCode();
            }

            public String toString() {
                return "Append(command=" + this.a + ")";
            }
        }

        public static final class Continue implements Result {
            public static final Continue INSTANCE = new Continue();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Continue);
            }

            public int hashCode() {
                return -1668507927;
            }

            public String toString() {
                return "Continue";
            }
        }

        public static final class Reject implements Result {
            public static final Reject INSTANCE = new Reject();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Reject);
            }

            public int hashCode() {
                return 127829601;
            }

            public String toString() {
                return "Reject";
            }
        }

        public static final class Replace implements Result {
            public final SignalingCommand a;

            public Replace(SignalingCommand signalingCommand) {
                this.a = signalingCommand;
            }

            public static /* synthetic */ Replace copy$default(Replace replace, SignalingCommand signalingCommand, int i, Object obj) {
                if ((i & 1) != 0) {
                    signalingCommand = replace.a;
                }
                return replace.copy(signalingCommand);
            }

            public final SignalingCommand component1() {
                return this.a;
            }

            public final Replace copy(SignalingCommand signalingCommand) {
                return new Replace(signalingCommand);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Replace) && epx.f(this.a, ((Replace) obj).a);
            }

            public final SignalingCommand getCommand() {
                return this.a;
            }

            public int hashCode() {
                return this.a.hashCode();
            }

            public String toString() {
                return "Replace(command=" + this.a + ")";
            }
        }
    }

    public static final SignalingCommandMerge create(SignalingCommand signalingCommand) {
        return Companion.create(signalingCommand);
    }

    public final <C extends SignalingCommandQueueIterator.CommandsQueueItem> boolean merge(SignalingCommandQueueIterator<C> signalingCommandQueueIterator) {
        while (signalingCommandQueueIterator.hasNext()) {
            Result mergeWith = mergeWith(signalingCommandQueueIterator.next().getCommand());
            if (!epx.f(mergeWith, Result.Continue.INSTANCE)) {
                if (mergeWith instanceof Result.Replace) {
                    return signalingCommandQueueIterator.replace(((Result.Replace) mergeWith).getCommand());
                }
                if (epx.f(mergeWith, Result.Reject.INSTANCE)) {
                    return true;
                }
                if (mergeWith instanceof Result.Append) {
                    return false;
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        return false;
    }

    public Result mergeWith(SignalingCommand signalingCommand) {
        return Result.Reject.INSTANCE;
    }
}
