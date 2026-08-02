package xsna;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.vk.voip.OKVoipEngine;
import com.vk.voip.ui.sessionrooms.dialog.SessionRoomsDialog;
import com.vkontakte.android.R;
import xsna.gm50;
import xsna.mk50;
import xsna.v1j;

/* compiled from: ConfigureRoomsDialog.kt */
/* loaded from: classes7.dex */
public final class n1j extends tl50<a2j, r2j, v1j> implements SessionRoomsDialog {
    public static final /* synthetic */ int k1 = 0;
    public a i1;
    public final c j1 = new c();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ConfigureRoomsDialog.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a COMPLETED;
        public static final a CREATE;
        public static final a HIDE_CLOSE_DIALOG;
        public static final a IDLE;
        public static final a LOADING;
        public static final a READY;

        static {
            a aVar = new a("IDLE", 0);
            IDLE = aVar;
            a aVar2 = new a("LOADING", 1);
            LOADING = aVar2;
            a aVar3 = new a("CREATE", 2);
            CREATE = aVar3;
            a aVar4 = new a("READY", 3);
            READY = aVar4;
            a aVar5 = new a("HIDE_CLOSE_DIALOG", 4);
            HIDE_CLOSE_DIALOG = aVar5;
            a aVar6 = new a("COMPLETED", 5);
            COMPLETED = aVar6;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* compiled from: ConfigureRoomsDialog.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.LOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.CREATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.READY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        o1j o1jVar = new o1j(requireContext());
        o1jVar.setBackgroundResource(R.drawable.bg_dark_top_rounded_corners_16);
        return new mk50.c(o1jVar);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        r2j r2jVar = (r2j) ao50Var;
        OKVoipEngine.b.getClass();
        OKVoipEngine.r.add(this.j1);
        o1j o1jVar = (o1j) view;
        Context requireContext = requireContext();
        dhr0.a.getClass();
        View inflate = LayoutInflater.from(new l7s(requireContext, dhr0.u().c)).inflate(R.layout.voip_session_rooms_admin_configure_rooms_dialog_progress, (ViewGroup) view, false);
        lak lakVar = new lak(this, getFeature().e, new e89(1, this, n1j.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 4));
        u1j u1jVar = new u1j(this, getFeature(), new wg1(1, this, n1j.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 8));
        gm50.a.b(this, r2jVar.a, new r9e(this, o1jVar, inflate, 3));
        gm50.a.b(this, r2jVar.b, new v63(this, o1jVar, inflate, 6));
        gm50.a.b(this, r2jVar.d, new ab6(this, o1jVar, lakVar, 3));
        gm50.a.b(this, r2jVar.c, new t3b(this, o1jVar, u1jVar, 2));
        gm50.a.b(this, r2jVar.e, new vh9(this, o1jVar, u1jVar, 7));
        gm50.a.b(this, r2jVar.f, new com.vk.movika.sdk.base.ui.s0(8, this, o1jVar));
    }

    public final void bo(ViewGroup viewGroup, a aVar) {
        if (this.i1 == aVar) {
            return;
        }
        this.i1 = aVar;
        int i = b.$EnumSwitchMapping$0[aVar.ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            zmp0.a(viewGroup, new biq());
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        OKVoipEngine.b.getClass();
        OKVoipEngine.r.remove(this.j1);
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        OKVoipEngine oKVoipEngine = OKVoipEngine.b;
        com.vk.voip.ui.c.b.getClass();
        return new a2j(oKVoipEngine, com.vk.voip.ui.c.B0.m());
    }

    @Override // xsna.tl50, xsna.dw20, xsna.c33, androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        Dialog yn = super.yn(bundle);
        Window window = yn.getWindow();
        if (window != null) {
            mhy.g(window);
        }
        return yn;
    }

    /* compiled from: ConfigureRoomsDialog.kt */
    public static final class c implements OKVoipEngine.a {
        public c() {
        }

        @Override // com.vk.voip.OKVoipEngine.a
        public final void a(boolean z) {
            if (!z || OKVoipEngine.b.isMeCreatorOrAdmin()) {
                return;
            }
            n1j.this.getFeature().C(v1j.d.b);
        }

        @Override // com.vk.voip.OKVoipEngine.a
        public final void b(String str, boolean z) {
        }
    }
}
