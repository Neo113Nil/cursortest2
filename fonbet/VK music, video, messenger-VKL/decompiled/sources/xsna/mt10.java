package xsna;

import android.content.Intent;
import android.widget.FrameLayout;
import com.vk.core.fragments.FragmentImpl;
import com.vk.mediapicker.api.models.MediaPickerConfiguration;
import com.vk.mediapicker.api.models.MediaPickerViewState;
import com.vk.mediastore.system.MediaStoreEntry;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MediaPickerFacade.kt */
/* loaded from: classes3.dex */
public interface mt10 {

    /* compiled from: MediaPickerFacade.kt */
    /* loaded from: classes.dex */
    public interface a {
        void Ag(List<? extends MediaStoreEntry> list);

        void K3(FrameLayout frameLayout);

        void Kc(MediaStoreEntry mediaStoreEntry);

        void U6(MediaPickerConfiguration.MediaType mediaType);

        void bl(MediaPickerViewState mediaPickerViewState);

        void tl(int i);
    }

    void C();

    void D();

    void K0(int i, String[] strArr);

    void a(int i);

    void b(int i);

    void c(int i, ArrayList arrayList);

    void d();

    void e(FragmentImpl fragmentImpl, MediaPickerConfiguration.MediaType mediaType);

    void f(int i);

    void g();

    void h(FragmentImpl fragmentImpl, int i, int i2, Intent intent);

    void i(int i);

    void j(int i, ArrayList arrayList);

    void k();

    void l(FragmentImpl fragmentImpl, MediaPickerConfiguration mediaPickerConfiguration, List list, a aVar);

    void onRequestPermissionsResult(int i, String[] strArr, int[] iArr);

    void onResume();
}
