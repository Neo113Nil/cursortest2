package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import com.vk.contacts.ContactSyncState;
import com.vk.dto.common.Peer;
import com.vk.dto.user.UserNameType;
import com.vk.im.engine.commands.account.Setting;
import com.vk.im.engine.config.PushInfoBarScheduleRepeat;
import com.vk.im.engine.models.InfoBar;
import com.vk.log.L;
import com.vk.toggle.data.Repeat;
import java.io.File;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.builders.ListBuilder;
import xsna.z6x;

/* compiled from: ImEngineProvider.kt */
@SuppressLint({"StaticFieldLeak"})
/* loaded from: classes11.dex */
public final class i2w {
    public static volatile boolean b = false;
    public static a1w c = null;
    public static pzv d = null;
    public static String e = "";
    public static final i2w a = new i2w();
    public static final b f = new b();

    /* compiled from: ImEngineProvider.kt */
    public static final class a implements io.reactivex.rxjava3.functions.f<daj> {
        /* JADX WARN: Multi-variable type inference failed */
        public final void a() {
            a1w a1wVar = i2w.c;
            a1w a1wVar2 = a1wVar == null ? null : a1wVar;
            if (a1wVar == null) {
                a1wVar = null;
            }
            a1wVar2.x(new m580(true, (InfoBar) ((it80) vdg0.a(a1wVar.n(this, new tsm()), new h2w(0))).a));
        }

        @Override // io.reactivex.rxjava3.functions.f
        public final void accept(daj dajVar) {
            daj dajVar2 = dajVar;
            if (dajVar2 instanceof yqw) {
                if (((yqw) dajVar2).a) {
                    UserNameType userNameType = o25.a().i().P;
                    UserNameType userNameType2 = UserNameType.CONTACT;
                    if (userNameType != userNameType2) {
                        o25.a().a0(userNameType2);
                        ks ksVar = new ks(new Setting.ImUserNameType(Setting.ImUserNameType.Type.CONTACT));
                        a1w a1wVar = i2w.c;
                        (a1wVar != null ? a1wVar : null).D(i2w.a, ksVar);
                    }
                }
                a();
                return;
            }
            if (dajVar2 instanceof brn0) {
                a();
                return;
            }
            if (dajVar2 instanceof jon0) {
                jon0 jon0Var = (jon0) dajVar2;
                if (jon0Var.a() == ContactSyncState.NOT_PERMITTED || jon0Var.a() == ContactSyncState.PERMITTED) {
                    pzv pzvVar = i2w.d;
                    if (pzvVar == null) {
                        pzvVar = null;
                    }
                    if (pzvVar.l().H0()) {
                        a1w a1wVar2 = i2w.c;
                        (a1wVar2 != null ? a1wVar2 : null).D(this, new o9q());
                        return;
                    }
                    return;
                }
                return;
            }
            if (!(dajVar2 instanceof fbj)) {
                if (dajVar2 instanceof waj) {
                    a1w a1wVar3 = i2w.c;
                    (a1wVar3 != null ? a1wVar3 : null).D(this, new vcj(((waj) dajVar2).a()));
                    return;
                } else {
                    if (dajVar2 instanceof uaj) {
                        a1w a1wVar4 = i2w.c;
                        (a1wVar4 != null ? a1wVar4 : null).D(this, new yhc(0));
                        return;
                    }
                    return;
                }
            }
            fbj fbjVar = (fbj) dajVar2;
            if (fbjVar.b() != 0) {
                a1w a1wVar5 = i2w.c;
                if (a1wVar5 == null) {
                    a1wVar5 = null;
                }
                a1wVar5.D(this, new quu());
            }
            if (fbjVar.a().isEmpty()) {
                return;
            }
            a1w a1wVar6 = i2w.c;
            (a1wVar6 != null ? a1wVar6 : null).D(this, new com.vk.im.engine.commands.contacts.b(fbjVar.a()));
        }
    }

    /* compiled from: ImEngineProvider.kt */
    public static final class b {
        public final x6x a(Context context, Peer peer) {
            String b = efz.b(peer.b, ".sqlite", new StringBuilder("vkm-jobs-"));
            if (!peer.Ab(Peer.Type.UNKNOWN)) {
                try {
                    File databasePath = context.getDatabasePath("vkm-jobs.sqlite");
                    File file = new File(b);
                    q9r i = obr.i(databasePath);
                    File s = nbr.s(nbr.s(i.a(), i.c() == 0 ? new File("..") : i.d(i.c() - 1)), file);
                    if (!s.exists() && databasePath.exists()) {
                        databasePath.renameTo(s);
                    }
                } catch (Throwable th) {
                    L.j(th, air.b(')', "Renaming jobs database file failed (vkm-jobs.sqlite to ", b));
                }
            }
            if (peer.Ab(Peer.Type.UNKNOWN)) {
                b = "vkm-jobs.sqlite";
            }
            pla plaVar = new pla();
            rgl rglVar = z6x.a.a;
            if (rglVar == null) {
                rglVar = null;
            }
            rglVar.getClass();
            return rgl.b(context, b, "im", plaVar);
        }
    }

    /* compiled from: ImEngineProvider.kt */
    /* loaded from: classes7.dex */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Repeat.values().length];
            try {
                iArr[Repeat.STOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Repeat.REPEAT_LAST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Repeat.CYCLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final synchronized a1w a() {
        a1w a1wVar;
        synchronized (i2w.class) {
            a1wVar = c;
            if (a1wVar == null) {
                a1wVar = null;
            }
        }
        return a1wVar;
    }

    public static bje0 b(l26 l26Var) {
        PushInfoBarScheduleRepeat pushInfoBarScheduleRepeat;
        if (l26Var == null || ((ListBuilder) l26Var.a()).isEmpty()) {
            return null;
        }
        List<Integer> a2 = l26Var.a();
        int i = c.$EnumSwitchMapping$0[l26Var.b().ordinal()];
        if (i == 1) {
            pushInfoBarScheduleRepeat = PushInfoBarScheduleRepeat.STOP;
        } else if (i == 2) {
            pushInfoBarScheduleRepeat = PushInfoBarScheduleRepeat.REPEAT_LAST;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            pushInfoBarScheduleRepeat = PushInfoBarScheduleRepeat.CYCLE;
        }
        return new bje0(a2, pushInfoBarScheduleRepeat);
    }
}
