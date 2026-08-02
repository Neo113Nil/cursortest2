package xsna;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.vkontakte.android.R;

/* compiled from: NspkChooserFragment.kt */
/* loaded from: classes2.dex */
public final class lm70 extends ck50 {
    public static final /* synthetic */ int l1 = 0;

    /* compiled from: NspkChooserFragment.kt */
    public static final class a {
        public static lm70 a(Uri uri) {
            String uri2 = uri.toString();
            lm70 lm70Var = new lm70();
            Bundle bundle = new Bundle();
            bundle.putString("sbp_link", uri2);
            lm70Var.setArguments(bundle);
            return lm70Var;
        }
    }

    public lm70() {
        this.D = true;
    }

    @Override // xsna.ck50
    public final yj50<?, ?, ?, ?, ?, ?, ?> Yn() {
        return new jm70(this, this);
    }

    @Override // xsna.ck50
    public final ViewGroup Zn(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) layoutInflater.inflate(R.layout.fragment_nspk_chooser, (ViewGroup) null, false);
    }
}
