package xsna;

import com.vk.im.engine.models.ImBgSyncState;
import com.vk.im.engine.models.LongPollType;
import com.vk.im.engine.models.dialogs.FolderType;
import com.vk.im.engine.reporters.syncstate.ImSyncStateStatReporter;

/* compiled from: DialogsToolbarTitleProviderImpl.kt */
/* loaded from: classes18.dex */
public final class mwm {
    public final b25 a;
    public final a1w b;
    public final io.reactivex.rxjava3.core.q<a1s> c;
    public final io.reactivex.rxjava3.core.w d = io.reactivex.rxjava3.schedulers.a.b();
    public final com.vk.im.engine.reporters.syncstate.a e;
    public final com.vk.im.engine.reporters.syncstate.a f;

    /* compiled from: DialogsToolbarTitleProviderImpl.kt */
    public interface a {

        /* compiled from: DialogsToolbarTitleProviderImpl.kt */
        /* renamed from: xsna.mwm$a$a, reason: collision with other inner class name */
        public static final class C3376a implements a {
            public final boolean a;

            public C3376a(boolean z) {
                this.a = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3376a) && this.a == ((C3376a) obj).a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.a);
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("Edu(isTeacher="), this.a, ')');
            }
        }

        /* compiled from: DialogsToolbarTitleProviderImpl.kt */
        public static final class b implements a {
            public final String a;

            public b(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("Group(title="), this.a, ')');
            }
        }

        /* compiled from: DialogsToolbarTitleProviderImpl.kt */
        public static final class c implements a {
            public static final c a = new c();
        }
    }

    /* compiled from: DialogsToolbarTitleProviderImpl.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[FolderType.values().length];
            try {
                iArr[FolderType.CHANNELS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[LongPollType.values().length];
            try {
                iArr2[LongPollType.CHANNELS.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[ImBgSyncState.values().length];
            try {
                iArr3[ImBgSyncState.REFRESHING.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr3[ImBgSyncState.REFRESHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr3[ImBgSyncState.CONNECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[ImBgSyncState.DISCONNECTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[ImBgSyncState.CONNECTING.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public mwm(b25 b25Var, a1w a1wVar, io.reactivex.rxjava3.core.q qVar) {
        this.a = b25Var;
        this.b = a1wVar;
        this.c = qVar;
        LongPollType longPollType = LongPollType.MESSAGES;
        ImSyncStateStatReporter.Target target = ImSyncStateStatReporter.Target.DIALOG_LIST;
        fr frVar = new fr(12);
        this.e = new com.vk.im.engine.reporters.syncstate.a(a1wVar, frVar, new com.vk.im.engine.reporters.syncstate.c(frVar), new j8(27), longPollType, target);
        LongPollType longPollType2 = LongPollType.CHANNELS;
        ImSyncStateStatReporter.Target target2 = ImSyncStateStatReporter.Target.CHANNELS_LIST;
        fr frVar2 = new fr(12);
        this.f = new com.vk.im.engine.reporters.syncstate.a(a1wVar, frVar2, new com.vk.im.engine.reporters.syncstate.c(frVar2), new j8(27), longPollType2, target2);
    }
}
