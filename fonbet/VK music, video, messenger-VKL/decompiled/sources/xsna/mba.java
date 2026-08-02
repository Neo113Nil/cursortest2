package xsna;

import android.view.View;
import com.vk.catalog2.common.dto.api.ui.UIBlock;

/* compiled from: CatalogOnClickListener.kt */
/* loaded from: classes16.dex */
public interface mba {
    default void w(View view, UIBlock uIBlock, Object obj) {
        z(view.getId(), uIBlock);
    }

    void z(int i, UIBlock uIBlock);

    default void m(int i, UIBlock uIBlock, izs<? super Boolean, s3q0> izsVar) {
    }

    default void q(int i, UIBlock uIBlock, Object obj) {
    }
}
