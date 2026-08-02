package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.ironsource.V5;
import com.vk.newsfeed.impl.posting.newposter.NewPosterFragment;
import com.vkontakte.android.R;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.Triple;

/* compiled from: NewPosterPresenter.kt */
/* loaded from: classes4.dex */
public final class p860 implements gm6, w8i {
    public static final int j = (int) iah0.y(22);
    public static final List<Integer> k = e43.l(-16777216, -1, -1685946, -27904, -13568, -10298825, -16732423, -3377951);
    public final NewPosterFragment b;
    public final Bundle c;
    public final Bundle d;
    public Bitmap f;
    public String g;
    public int e = k.get(0).intValue();
    public final Object h = msy.a(LazyThreadSafetyMode.NONE, new b010(this, 14));
    public final bpn0 i = new bpn0(new kr50(this, 1));

    public p860(NewPosterFragment newPosterFragment, Bundle bundle, Bundle bundle2) {
        this.b = newPosterFragment;
        this.c = bundle;
        this.d = bundle2;
    }

    @Override // xsna.gm6
    public final boolean a0() {
        return false;
    }

    @SuppressLint({"CheckResult"})
    public final void b(String str) {
        String str2;
        this.g = str;
        int t = ahn.t(new File(str));
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        int i = options.outWidth;
        int i2 = options.outHeight;
        if (t == 90 || t == 270) {
            i2 = i;
            i = i2;
        }
        float f = i;
        float f2 = i2;
        if ((1.0f * f) / f2 > 1.3333334f) {
            i = (int) (f2 * 1.3333334f);
        } else {
            i2 = (int) (f / 1.3333334f);
        }
        Pair pair = new Pair(Integer.valueOf(i), Integer.valueOf(i2));
        int intValue = ((Number) pair.d()).intValue();
        int intValue2 = ((Number) pair.g()).intValue();
        if (intValue >= 550 && intValue2 >= 413) {
            io.reactivex.rxjava3.internal.operators.observable.m1 a0 = io.reactivex.rxjava3.core.q.N(new Triple(Integer.valueOf(iah0.f().widthPixels / 10), Integer.valueOf((iah0.f().widthPixels / 30) * 4), Boolean.TRUE), new Triple(Integer.valueOf(iah0.f().widthPixels), Integer.valueOf((iah0.f().widthPixels / 3) * 4), Boolean.FALSE)).U(new o860(new g5l(options, str, t, this), 0)).r0(io.reactivex.rxjava3.schedulers.a.a()).a0(io.reactivex.rxjava3.android.schedulers.a.b());
            b8v b8vVar = new b8v(new kn20(this, 12), 11);
            int i3 = kwg0.a;
            a0.subscribe(b8vVar, new iwg0());
            return;
        }
        FragmentActivity activity = this.b.getActivity();
        if (activity == null || (str2 = activity.getString(R.string.newposter_little_image, 550, 413)) == null) {
            str2 = "";
        }
        cvk.w(str2, false);
    }

    @Override // xsna.gm6
    public final void d() {
        NewPosterFragment newPosterFragment = this.b;
        j860 j860Var = newPosterFragment.T;
        if (j860Var == null) {
            j860Var = null;
        }
        List<Integer> list = k;
        j860Var.setItems(list);
        j860Var.notifyDataSetChanged();
        Bundle bundle = this.c;
        String string = bundle.getString("text", "");
        if (string != null) {
            if (string.length() == 0) {
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                string = context.getString(R.string.what_new);
            }
            TextView textView = newPosterFragment.X;
            if (textView != null) {
                textView.setText(string);
            }
        }
        int i = j;
        int min = Math.min(i, bundle.getInt("textSize", i));
        TextView textView2 = newPosterFragment.X;
        if (textView2 != null) {
            textView2.setTextSize(0, min);
        }
        Bundle bundle2 = this.d;
        if (bundle2.containsKey(V5.c.c)) {
            String string2 = bundle2.getString(V5.c.c, "");
            if (string2.length() > 0) {
                b(string2);
            }
        }
        if (bundle2.containsKey("textColor")) {
            int i2 = bundle2.getInt("textColor", list.get(0).intValue());
            newPosterFragment.d1(i2);
            j860 j860Var2 = newPosterFragment.T;
            if (j860Var2 == null) {
                j860Var2 = null;
            }
            int indexOf = ((ArrayList) j860Var2.y0()).indexOf(Integer.valueOf(i2));
            if (indexOf >= 0) {
                j860 j860Var3 = newPosterFragment.T;
                j860 j860Var4 = j860Var3 != null ? j860Var3 : null;
                j860Var4.f = indexOf;
                j860Var4.notifyDataSetChanged();
            }
            this.e = i2;
        }
    }

    public final void g() {
        NewPosterFragment newPosterFragment = this.b;
        FragmentActivity activity = newPosterFragment.getActivity();
        if (activity == null) {
            return;
        }
        newPosterFragment.startActivityForResult(new Intent(activity, hd60.a().l0()).putExtra("single_mode", true), 10);
    }

    @Override // xsna.cc6
    public final void onDestroy() {
    }

    @Override // xsna.gm6
    public final void onDestroyView() {
    }

    @Override // xsna.cc6
    public final void onPause() {
    }

    @Override // xsna.cc6
    public final void onResume() {
    }

    @Override // xsna.gm6
    public final void onStart() {
    }

    @Override // xsna.gm6
    public final void onStop() {
    }
}
