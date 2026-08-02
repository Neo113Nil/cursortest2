package xsna;

import android.os.Bundle;
import com.vk.dto.common.data.VKList;
import com.vk.dto.photo.Photo;

/* compiled from: BasePhotoListContract.kt */
/* loaded from: classes4.dex */
public interface gj6 extends gm6 {
    io.reactivex.rxjava3.core.q<VKList<Photo>> O(oap<Integer, String> oapVar, int i);

    void h();

    default void i6(Bundle bundle, Bundle bundle2) {
    }
}
