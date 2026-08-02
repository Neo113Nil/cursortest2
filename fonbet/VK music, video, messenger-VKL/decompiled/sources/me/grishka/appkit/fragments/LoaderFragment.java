package me.grishka.appkit.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.vk.core.utils.newtork.b;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.android.schedulers.a;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import xsna.cbs;
import xsna.cw;
import xsna.io3;
import xsna.j03;
import xsna.j6r0;
import xsna.s01;
import xsna.tc;
import xsna.z6u;
import xsna.zvv;

/* loaded from: classes11.dex */
public abstract class LoaderFragment extends AppKitFragment implements SwipeRefreshLayout.f, cbs {
    public static final /* synthetic */ int k0 = 0;
    public int Z;
    public View a0;
    public View b0;
    public View c0;
    public ViewGroup d0;
    public View e0;
    public boolean f0;
    public boolean g0;
    public final boolean h0;
    public c i0;
    public c j0;

    public LoaderFragment() {
        this(R.layout.appkit_loader_fragment);
    }

    public final void I() {
        View view = this.c0;
        if (view != null) {
            j6r0.c(4, view);
            j6r0.c(4, this.a0);
            j6r0.c(0, this.b0);
        }
        this.j0.dispose();
    }

    public void h() {
        qo();
    }

    public void i0() {
        View view = this.c0;
        if (view != null) {
            if (this.h0) {
                j6r0.c(0, view);
                j6r0.c(4, this.a0);
                j6r0.c(4, this.b0);
            } else {
                view.setVisibility(0);
                this.a0.setVisibility(4);
                this.b0.setVisibility(4);
            }
        }
        this.j0.dispose();
    }

    public void no(@NonNull View view, Throwable th) {
        TextView textView = (TextView) view.findViewById(R.id.error_text);
        TextView textView2 = (TextView) view.findViewById(R.id.error_retry);
        if (textView != null) {
            textView.setText(j03.f(view.getContext(), th));
        }
        if (textView2 != null) {
            textView2.setText(R.string.err_try_again);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(this.Z, (ViewGroup) null);
        this.d0 = viewGroup2;
        View findViewById = viewGroup2.findViewById(R.id.content_stub);
        ViewGroup viewGroup3 = (ViewGroup) findViewById.getParent();
        View ro = ro(layoutInflater, this.d0, bundle);
        this.c0 = ro;
        ro.setLayoutParams(findViewById.getLayoutParams());
        viewGroup3.addView(this.c0, viewGroup3.indexOfChild(findViewById));
        viewGroup3.removeView(findViewById);
        this.b0 = this.d0.findViewById(R.id.loading);
        this.a0 = this.d0.findViewById(R.id.error);
        this.c0.setVisibility(this.f0 ? 0 : 4);
        this.b0.setVisibility(this.f0 ? 4 : 0);
        View findViewById2 = this.a0.findViewById(R.id.error_retry);
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new s01(this, 5));
        }
        this.e0 = this.d0.findViewById(R.id.shadow);
        return this.d0;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        c cVar = this.i0;
        if (cVar != null) {
            cVar.dispose();
            this.i0 = null;
        }
        this.j0.dispose();
    }

    @Override // me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.c0 = null;
        this.a0 = null;
        this.b0 = null;
        this.d0 = null;
    }

    public void onError(Throwable th) {
        this.g0 = false;
        this.i0 = null;
        View view = this.a0;
        if (view == null) {
            return;
        }
        this.f0 = false;
        no(view, th);
        j6r0.c(0, this.a0);
        j6r0.c(4, this.b0);
        j6r0.c(4, this.c0);
        if (this.j0.h()) {
            b.a.getClass();
            if (!b.d()) {
                this.j0 = b.f().K().m(a.b()).subscribe(new cw(this, 25));
            }
            zvv.a(new io3(24));
        }
    }

    public void oo() {
        this.f0 = true;
        i0();
        zvv.a(new z6u(5));
    }

    public abstract void po();

    public final void qo() {
        zvv.a(new tc(28));
        I();
        this.g0 = true;
        po();
    }

    public abstract View ro(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);

    public void so() {
        j6r0.c(4, this.a0);
        j6r0.c(0, this.b0);
        qo();
    }

    public final void to(int i) {
        if (this.c0 != null) {
            throw new IllegalStateException("Can't set layout when view is already created");
        }
        this.Z = i;
    }

    public LoaderFragment(int i) {
        this.h0 = true;
        this.j0 = EmptyDisposable.INSTANCE;
        this.Z = i;
    }
}
