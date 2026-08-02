package xsna;

import android.view.View;
import android.widget.TextView;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionClearSection;
import com.vk.catalog2.common.ui.mvp.holder.header.VkTopBarVh;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class nbt0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nbt0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        UIBlockActionClearSection uIBlockActionClearSection;
        String str;
        switch (this.b) {
            case 0:
                return Boolean.valueOf(((pbt0) this.c).b.J().a());
            case 1:
                VkTopBarVh vkTopBarVh = (VkTopBarVh) this.c;
                UIBlockList uIBlockList = vkTopBarVh.q;
                if (uIBlockList == null || (uIBlockActionClearSection = uIBlockList.E) == null || (str = uIBlockActionClearSection.b) == null) {
                    return s3q0.a;
                }
                wo1 wo1Var = new wo1(21, vkTopBarVh, str);
                sha shaVar = vkTopBarVh.i;
                if (shaVar != null) {
                    shaVar.a(vkTopBarVh.b(), wo1Var).show();
                } else {
                    wo1Var.invoke();
                }
                return s3q0.a;
            default:
                return (TextView) ((View) ((qyw0) this.c).e.getValue()).findViewById(R.id.call_by_link_media_setting_disabled_on_join_view);
        }
    }
}
