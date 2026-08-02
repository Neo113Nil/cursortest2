package me.grishka.appkit.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vkontakte.android.R;

/* loaded from: classes8.dex */
public abstract class ToolbarFragment extends AppKitFragment {
    public final int Z;
    public View a0;

    public ToolbarFragment() {
        this(R.layout.appkit_toolbar_fragment);
    }

    public abstract View no(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.Z, (ViewGroup) null);
        this.a0 = inflate;
        ((ViewGroup) inflate.findViewById(R.id.appkit_content)).addView(no(layoutInflater, (ViewGroup) this.a0, bundle));
        return this.a0;
    }

    @Override // me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.a0 = null;
    }

    public ToolbarFragment(int i) {
        this.Z = i;
    }
}
