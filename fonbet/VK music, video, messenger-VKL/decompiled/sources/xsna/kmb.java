package xsna;

import android.view.View;
import com.vk.api.generated.appWidgets.dto.AppWidgetsUpdateTypeDto;
import com.vk.dto.actionlinks.ActionLink;
import com.vk.profile.community.api.widget.dto.CommunityWidgetPreviewArguments;
import com.vk.profile.community.impl.ui.widget.CommunityWidgetPreviewFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class kmb implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ kmb(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AppWidgetsUpdateTypeDto appWidgetsUpdateTypeDto;
        int i = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                nmb nmbVar = (nmb) obj3;
                mhy.d(nmbVar);
                ((gmb) obj2).a(nmbVar.getContext(), (ActionLink) ((pmb) obj).b);
                break;
            default:
                CommunityWidgetPreviewFragment communityWidgetPreviewFragment = (CommunityWidgetPreviewFragment) obj3;
                CommunityWidgetPreviewArguments communityWidgetPreviewArguments = (CommunityWidgetPreviewArguments) obj2;
                View view2 = (View) obj;
                int i2 = CommunityWidgetPreviewFragment.U;
                try {
                    appWidgetsUpdateTypeDto = AppWidgetsUpdateTypeDto.valueOf(cqm0.n(communityWidgetPreviewArguments.i));
                } catch (Exception unused) {
                    appWidgetsUpdateTypeDto = null;
                }
                if (appWidgetsUpdateTypeDto != null) {
                    hg1.b(view2, rsg0.y0(yfb.x(((kc3) communityWidgetPreviewFragment.T.getValue()).a(communityWidgetPreviewArguments.h, appWidgetsUpdateTypeDto, communityWidgetPreviewArguments.d, Integer.valueOf((int) communityWidgetPreviewArguments.g))), null, null, 3).subscribe(new y50(new zqh(communityWidgetPreviewFragment, 2), 17), new st0(new i4h(communityWidgetPreviewFragment, 6), 10)));
                    break;
                }
                break;
        }
    }
}
