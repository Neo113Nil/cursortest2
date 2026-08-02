package com.vkontakte.android.fragments;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;
import java.util.HashSet;
import java.util.WeakHashMap;
import me.grishka.appkit.views.UsableRecyclerView;
import xsna.bwt0;
import xsna.fnj;
import xsna.gpu0;
import xsna.iah0;
import xsna.j6r0;
import xsna.jjv0;
import xsna.kt9;
import xsna.mf7;

/* loaded from: classes7.dex */
public abstract class CardRecyclerFragment<T> extends VKRecyclerFragment<T> {
    public RecyclerView.n I0;

    public gpu0 Io(jjv0 jjv0Var) {
        int i;
        Context mo2getContext = mo2getContext();
        HashSet hashSet = iah0.a;
        boolean d = fnj.d(mo2getContext);
        gpu0 gpu0Var = new gpu0(mo2getContext());
        gpu0Var.j = jjv0Var;
        if (d) {
            float max = Math.max(16, (this.V - 924) / 2);
            WeakHashMap weakHashMap = j6r0.a;
            i = iah0.a(max);
        } else {
            i = 0;
        }
        this.n0.setPadding(i, 0, i, 0);
        return gpu0Var;
    }

    public void Jo() {
        this.n0.removeItemDecoration(this.I0);
        if (this.n0.getAdapter() instanceof jjv0) {
            UsableRecyclerView usableRecyclerView = this.n0;
            gpu0 Io = Io((jjv0) usableRecyclerView.getAdapter());
            this.I0 = Io;
            usableRecyclerView.addItemDecoration(Io);
            return;
        }
        UsableRecyclerView usableRecyclerView2 = this.n0;
        Context mo2getContext = mo2getContext();
        HashSet hashSet = iah0.a;
        boolean d = fnj.d(mo2getContext);
        UsableRecyclerView usableRecyclerView3 = this.n0;
        kt9 kt9Var = new kt9(usableRecyclerView3, (mf7) usableRecyclerView3.getAdapter(), !d);
        WeakHashMap weakHashMap = j6r0.a;
        int a = iah0.a(2.0f);
        int a2 = iah0.a(3.0f);
        int a3 = iah0.a(8.0f);
        kt9Var.i = a;
        kt9Var.j = a2;
        kt9Var.k = a3;
        kt9Var.l = 0;
        int a4 = d ? iah0.a(Math.max(16, (this.V - 924) / 2)) : 0;
        this.n0.setPadding(a4, 0, a4, 0);
        this.I0 = kt9Var;
        usableRecyclerView2.addItemDecoration(kt9Var);
        bwt0.Z(R.attr.vk_ui_background, this.n0);
    }

    @Override // me.grishka.appkit.fragments.BaseRecyclerFragment, me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        ko(getResources().getConfiguration());
    }

    @Override // me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ko(configuration);
        Jo();
    }

    @Override // me.grishka.appkit.fragments.BaseRecyclerFragment, me.grishka.appkit.fragments.LoaderFragment, me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.I0 = null;
    }

    @Override // com.vkontakte.android.fragments.VKRecyclerFragment, me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.n0.setScrollBarStyle(33554432);
        Jo();
    }
}
