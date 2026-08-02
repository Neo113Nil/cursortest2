package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeCreatorHideUndoHideClick;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: UndoHideButtonDelegate.kt */
/* loaded from: classes16.dex */
public final class b3q0 {
    public final mcc0 a;
    public final FunctionReferenceImpl b;
    public io.reactivex.rxjava3.disposables.c c;
    public b d = b.UNDO_HIDE_DISABLED;

    /* compiled from: UndoHideButtonDelegate.kt */
    public interface a {
        void a(int i, int i2, boolean z);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UndoHideButtonDelegate.kt */
    public static final class b {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b HIDE_DISABLED;
        public static final b HIDE_ENABLED;
        public static final b UNDO_HIDE_DISABLED;
        public static final b UNDO_HIDE_ENABLED;
        private final int buttonDescription;
        private final int buttonText;
        private final boolean isEnabled;

        static {
            b bVar = new b(0, R.string.hide_author_button_text, "HIDE_ENABLED", R.string.hide_author_button_accessibility, true);
            HIDE_ENABLED = bVar;
            b bVar2 = new b(1, R.string.hide_author_button_text, "HIDE_DISABLED", R.string.hide_author_button_accessibility, false);
            HIDE_DISABLED = bVar2;
            b bVar3 = new b(2, R.string.unhide_author_button_text, "UNDO_HIDE_ENABLED", R.string.unhide_author_button_accessibility, true);
            UNDO_HIDE_ENABLED = bVar3;
            b bVar4 = new b(3, R.string.unhide_author_button_text, "UNDO_HIDE_DISABLED", R.string.unhide_author_button_accessibility, false);
            UNDO_HIDE_DISABLED = bVar4;
            b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
            $VALUES = bVarArr;
            $ENTRIES = new asp(bVarArr);
        }

        public b(int i, int i2, String str, int i3, boolean z) {
            this.buttonText = i2;
            this.buttonDescription = i3;
            this.isEnabled = z;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }

        public final int h() {
            return this.buttonDescription;
        }

        public final int i() {
            return this.buttonText;
        }

        public final boolean j() {
            return this.isEnabled;
        }
    }

    /* compiled from: UndoHideButtonDelegate.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.HIDE_ENABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.UNDO_HIDE_ENABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b3q0(mcc0 mcc0Var, izs<? super MobileOfficialAppsVideoStat$TypeCreatorHideUndoHideClick.EventType, s3q0> izsVar) {
        this.a = mcc0Var;
        this.b = (FunctionReferenceImpl) izsVar;
    }

    public final void a(Group group, a aVar) {
        int i = c.$EnumSwitchMapping$0[this.d.ordinal()];
        mcc0 mcc0Var = this.a;
        if (i == 1) {
            this.d = b.HIDE_DISABLED;
            b(aVar);
            UserId userId = group.c;
            xq1 xq1Var = new xq1(14, this, aVar);
            n0 n0Var = new n0(27, this, aVar);
            com.vk.core.utils.newtork.b.a.getClass();
            if (!com.vk.core.utils.newtork.b.d()) {
                cvk.u(R.string.error_network, false);
                n0Var.invoke();
                return;
            }
            io.reactivex.rxjava3.disposables.c cVar = this.c;
            if (cVar != null) {
                cVar.dispose();
            }
            List singletonList = Collections.singletonList(fkq0.e(userId));
            tfx tfxVar = new tfx("video.subscribeHideAuthors", new mft0(), new gsi0(6));
            tfx.p(tfxVar, "author_ids", singletonList, 0L, 12);
            io.reactivex.rxjava3.disposables.c subscribe = rsg0.Z(yfb.x(tfxVar)).o(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new rz(xq1Var, 6), new pmu(new mdm0(n0Var, 7), 26));
            mcc0Var.a(subscribe);
            this.c = subscribe;
            return;
        }
        if (i != 2) {
            return;
        }
        this.d = b.UNDO_HIDE_DISABLED;
        b(aVar);
        UserId userId2 = group.c;
        yq1 yq1Var = new yq1(21, this, aVar);
        ss3 ss3Var = new ss3(22, this, aVar);
        com.vk.core.utils.newtork.b.a.getClass();
        if (!com.vk.core.utils.newtork.b.d()) {
            cvk.u(R.string.error_network, false);
            ss3Var.invoke();
            return;
        }
        io.reactivex.rxjava3.disposables.c cVar2 = this.c;
        if (cVar2 != null) {
            cVar2.dispose();
        }
        List singletonList2 = Collections.singletonList(fkq0.e(userId2));
        tfx tfxVar2 = new tfx("video.subscribeUnhideAuthors", new sf3(29), new aoq0(4));
        tfx.p(tfxVar2, "author_ids", singletonList2, 0L, 12);
        io.reactivex.rxjava3.disposables.c subscribe2 = rsg0.Z(yfb.x(tfxVar2)).o(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new lm1(yq1Var, 5), new d750(new hb40(ss3Var, 27), 23));
        mcc0Var.a(subscribe2);
        this.c = subscribe2;
    }

    public final void b(a aVar) {
        aVar.a(this.d.i(), this.d.h(), this.d.j());
    }
}
