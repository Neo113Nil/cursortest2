package defpackage;

import com.yandex.go.places.impl.domain.interactors.a;
import com.yandex.go.places.models.data.entities.network.ImageDto;
import com.yandex.go.places.models.data.entities.network.actions.GoalTrackingLinkFlexAction;
import com.yandex.go.places.models.data.entities.network.actions.ShowFavoritesNotificationFlexAction;

/* loaded from: classes13.dex */
public final class gst extends j15 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gst(a aVar, int i) {
        super(aVar);
        this.b = i;
    }

    @Override // defpackage.j15
    public final fr a(kr krVar) {
        String str;
        String str2;
        String str3;
        switch (this.b) {
            case 0:
                GoalTrackingLinkFlexAction goalTrackingLinkFlexAction = (GoalTrackingLinkFlexAction) krVar;
                String str4 = goalTrackingLinkFlexAction.b;
                if (str4 == null || evu0.J(str4) || (str = goalTrackingLinkFlexAction.d) == null) {
                    return null;
                }
                String str5 = goalTrackingLinkFlexAction.b;
                if (str5 != null) {
                    return goalTrackingLinkFlexAction.a ? new zq(str5, goalTrackingLinkFlexAction.c, str) : new sp(str5, str);
                }
                ny61.g("Required value was null.");
                return null;
            default:
                ShowFavoritesNotificationFlexAction showFavoritesNotificationFlexAction = (ShowFavoritesNotificationFlexAction) krVar;
                String str6 = showFavoritesNotificationFlexAction.b;
                if (str6 == null) {
                    return null;
                }
                if (evu0.J(str6)) {
                    str6 = null;
                }
                if (str6 == null || (str2 = showFavoritesNotificationFlexAction.c) == null) {
                    return null;
                }
                if (evu0.J(str2)) {
                    str2 = null;
                }
                if (str2 == null || (str3 = showFavoritesNotificationFlexAction.d) == null) {
                    return null;
                }
                if (evu0.J(str3)) {
                    str3 = null;
                }
                if (str3 == null) {
                    return null;
                }
                ImageDto imageDto = showFavoritesNotificationFlexAction.a;
                String str7 = imageDto != null ? imageDto.a : null;
                if (str7 == null) {
                    str7 = "";
                }
                return new yq(str7, str6, str2, str3);
        }
    }
}
