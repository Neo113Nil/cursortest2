package xsna;

import android.content.Context;
import android.view.View;
import com.vk.catalog2.common.dto.api.banner.Banner;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.button.HorizontalButtonLargeWithIconVh;
import com.vk.catalog2.common.ui.holders.container.BannersVh;
import com.vk.core.serialize.Serializer;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class w36 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Serializer.StreamParcelableAdapter e;

    public /* synthetic */ w36(Object obj, Object obj2, Serializer.StreamParcelableAdapter streamParcelableAdapter, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = streamParcelableAdapter;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        Serializer.StreamParcelableAdapter streamParcelableAdapter = this.e;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((BannersVh.a) obj2).b.invoke((Context) obj, (Banner) streamParcelableAdapter);
                break;
            default:
                UIBlock uIBlock = (UIBlock) streamParcelableAdapter;
                ((HorizontalButtonLargeWithIconVh) obj2).a((String) obj, uIBlock.f);
                s1v s1vVar = p1s0.a;
                p1s0.c(uIBlock, new com.vk.stat.scheme.j0());
                break;
        }
    }
}
