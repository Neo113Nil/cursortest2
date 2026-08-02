package xsna;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vkontakte.android.R;
import xsna.dw20;

/* compiled from: CollectDumpFragment.kt */
/* loaded from: classes7.dex */
public final class h4g extends dw20 {
    public static final /* synthetic */ int g1 = 0;
    public final f4g f1 = new f4g(new g4g(this, 0));

    /* compiled from: CollectDumpFragment.kt */
    public static final class a extends dw20.b {
        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            return new h4g();
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        if (bundle != null) {
            tn();
        }
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f1.b.dispose();
        super.onDestroyView();
    }

    @Override // xsna.dw20, xsna.c33, androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        View inflate = LayoutInflater.from(mo2getContext()).inflate(R.layout.voip_collect_dump, (ViewGroup) null, false);
        f4g f4gVar = this.f1;
        f4gVar.d = new n4g(inflate, f4gVar);
        f4gVar.a();
        dw20.Rn(this, inflate, 6);
        return super.yn(bundle);
    }
}
