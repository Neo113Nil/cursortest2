package xsna;

import com.vk.catalog2.common.ui.core.util.EditorMode;
import com.vk.catalog2.common.ui.mvp.holder.header.VkTopBarVh;
import com.vk.vmoji.character.model.VmojiProductModel;
import xsna.e6w0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class puv0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ puv0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                VkTopBarVh vkTopBarVh = (VkTopBarVh) obj2;
                vkTopBarVh.c.b(new zra(EditorMode.EXIT_EDITOR_MODE_DISCARD, (String) obj), true);
                vkTopBarVh.d(!vkTopBarVh.r);
                break;
            default:
                ((m6w0) obj2).C(new e6w0.c((VmojiProductModel) obj));
                break;
        }
        return s3q0.a;
    }
}
