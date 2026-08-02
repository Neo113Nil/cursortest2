package me.grishka.appkit.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.vkontakte.android.R;
import xsna.kxn0;

/* loaded from: classes11.dex */
public abstract class TabbedLoaderFragment extends LoaderFragment {
    public final a l0;

    /* loaded from: classes8.dex */
    public class a extends kxn0 {
        public a(TabbedLoaderFragment tabbedLoaderFragment) {
            super(tabbedLoaderFragment);
        }

        @Override // xsna.kxn0
        public final kxn0.b b() {
            return new kxn0.b();
        }

        @Override // xsna.kxn0
        public final void h() {
            TabbedLoaderFragment.this.invalidateOptionsMenu();
        }

        @Override // xsna.kxn0
        public final void k() {
            TabbedLoaderFragment.this.uo();
        }

        @Override // xsna.kxn0
        public final void l(int i) {
            TabbedLoaderFragment.this.getClass();
        }
    }

    public TabbedLoaderFragment() {
        super(R.layout.appkit_loader_fragment_tabs);
        this.l0 = new a(this);
    }

    @Override // me.grishka.appkit.fragments.LoaderFragment
    public final void i0() {
        super.i0();
        this.l0.p(true);
    }

    @Override // me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        setHasOptionsMenu(true);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        this.l0.i(menu, menuInflater);
    }

    @Override // me.grishka.appkit.fragments.LoaderFragment, me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.l0.d();
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return this.l0.j(menuItem);
    }

    @Override // me.grishka.appkit.fragments.LoaderFragment
    public final View ro(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        a aVar = this.l0;
        View c = aVar.c(layoutInflater, viewGroup);
        aVar.p(false);
        return c;
    }

    public void uo() {
    }
}
