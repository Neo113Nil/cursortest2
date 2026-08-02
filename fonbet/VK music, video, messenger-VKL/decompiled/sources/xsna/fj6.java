package xsna;

import android.os.Bundle;
import com.vk.dto.common.data.VKList;
import com.vk.dto.photo.Photo;

/* compiled from: BasePhotoListContract.kt */
/* loaded from: classes3.dex */
public interface fj6 extends gm6 {
    io.reactivex.rxjava3.core.q<VKList<Photo>> O(oap<Integer, String> oapVar, int i);

    boolean Q6();

    boolean X6();

    void h();

    default void onCreate(Bundle bundle) {
    }
}
