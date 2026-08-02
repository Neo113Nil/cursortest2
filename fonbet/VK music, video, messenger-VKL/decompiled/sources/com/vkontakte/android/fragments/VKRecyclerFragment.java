package com.vkontakte.android.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.money.MoneyTransfersFragment;
import com.vkontakte.android.R;
import java.util.WeakHashMap;
import me.grishka.appkit.fragments.BaseRecyclerFragment;
import me.grishka.appkit.views.UsableRecyclerView;
import xsna.h3p0;
import xsna.iah0;
import xsna.j6r0;
import xsna.y3v;

/* loaded from: classes7.dex */
public abstract class VKRecyclerFragment<T> extends BaseRecyclerFragment<T> {
    public final y3v G0;
    public boolean H0;

    public VKRecyclerFragment(int i) {
        super(i);
        this.G0 = new y3v();
        this.H0 = true;
    }

    @Override // me.grishka.appkit.fragments.AppKitFragment, xsna.e1z
    public boolean ea() {
        return !(this instanceof MoneyTransfersFragment);
    }

    @Override // me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        h3p0.c(this, this.Q);
    }

    @Override // me.grishka.appkit.fragments.BaseRecyclerFragment, me.grishka.appkit.fragments.LoaderFragment
    public View ro(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View ro = super.ro(layoutInflater, viewGroup, bundle);
        UsableRecyclerView usableRecyclerView = this.n0;
        WeakHashMap weakHashMap = j6r0.a;
        usableRecyclerView.setPadding(0, iah0.a(8.0f), 0, iah0.a(8.0f));
        this.n0.setSelector(R.drawable.highlight);
        if (this.H0) {
            this.n0.addOnScrollListener(this.G0);
        }
        return ro;
    }

    public VKRecyclerFragment(int i, int i2) {
        super(i, i2);
        this.G0 = new y3v();
        this.H0 = true;
    }
}
