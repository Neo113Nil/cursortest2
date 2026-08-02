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

/* loaded from: classes8.dex */
public class TabbedFragment extends ToolbarFragment {
    public final a b0;

    public class a extends kxn0 {
        public a(TabbedFragment tabbedFragment) {
            super(tabbedFragment);
        }

        @Override // xsna.kxn0
        public final void h() {
            TabbedFragment.this.invalidateOptionsMenu();
        }

        @Override // xsna.kxn0
        public final void l(int i) {
            TabbedFragment.this.onPageSelected(i);
        }
    }

    public TabbedFragment() {
        super(R.layout.appkit_toolbar_fragment_tabs);
        this.b0 = new a(this);
    }

    @Override // me.grishka.appkit.fragments.ToolbarFragment
    public final View no(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.b0.c(layoutInflater, viewGroup);
    }

    @Override // me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        setHasOptionsMenu(true);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        this.b0.i(menu, menuInflater);
    }

    @Override // me.grishka.appkit.fragments.ToolbarFragment, me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.b0.d();
    }

    @Override // androidx.fragment.app.Fragment
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        return this.b0.j(menuItem);
    }

    public void onPageSelected(int i) {
    }
}
