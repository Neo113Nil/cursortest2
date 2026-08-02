package xsna;

import androidx.fragment.app.Fragment;
import com.vk.im.itemlist.impl.presentation.fragment.ImItemListFragment;

/* compiled from: ImItemListFragmentFactoryImpl.kt */
/* loaded from: classes2.dex */
public final class v5w implements u5w {
    @Override // xsna.u5w
    public final Fragment a() {
        return new ImItemListFragment.a(ImItemListFragment.class, null, null).f();
    }

    @Override // xsna.u5w
    public final Class<? extends Fragment> b() {
        return ImItemListFragment.class;
    }
}
