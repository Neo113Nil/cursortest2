package xsna;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.vk.api.generated.notifications.dto.NotificationsNotificationSettingRedesignDto;
import com.vk.profile.user.impl.ui.view.header.UserProfileHeaderView;
import com.vk.settings.impl.presentation.base.fragment.settings.RedesignNotificationSettingsFragment;
import com.vk.sharing.core.view.SharingActionsView;
import com.vk.video.ui.discovery.minimizable.c;
import java.lang.ref.WeakReference;
import kotlin.Pair;
import xsna.rf70;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class nlf0 implements pcs, SharingActionsView.b, io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.m, i0u0, io.reactivex.rxjava3.functions.g {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nlf0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 2:
                return (s3q0) ((fa00) this.c).invoke(obj);
            case 3:
                return (it80) ((fa00) this.c).invoke(obj);
            case 6:
                return (jwk) ((wv2) this.c).invoke(obj);
            case 10:
                return (vqt) ((ito0) this.c).invoke(obj);
            case 12:
                return (Pair) ((hfm0) this.c).invoke(obj);
            default:
                return (Pair) ((xlq0) this.c).invoke(obj);
        }
    }

    @Override // io.reactivex.rxjava3.functions.g
    public Object d(Object obj, Object obj2, Object obj3) {
        return (c.s0.h) ((v9a) this.c).invoke(obj, obj2, obj3);
    }

    @Override // xsna.i0u0
    public View get() {
        UserProfileHeaderView userProfileHeaderView = (UserProfileHeaderView) this.c;
        int i = UserProfileHeaderView.G;
        return (View) new WeakReference(userProfileHeaderView).get();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.pcs
    public void p(Bundle bundle, String str) {
        Parcelable parcelable;
        Object parcelable2;
        RedesignNotificationSettingsFragment redesignNotificationSettingsFragment = (RedesignNotificationSettingsFragment) this.c;
        RedesignNotificationSettingsFragment.a aVar = RedesignNotificationSettingsFragment.Y;
        if (((String) redesignNotificationSettingsFragment.R.getValue()) != null) {
            redesignNotificationSettingsFragment.kn().getSupportFragmentManager().k0(bundle, "UPDATE_SETTING_FROM_SECTION_KEY");
        }
        String string = bundle.getString("setting_id");
        int i = bundle.getInt("sources_count", -1);
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable2 = bundle.getParcelable("setting", NotificationsNotificationSettingRedesignDto.class);
            parcelable = (Parcelable) parcelable2;
        } else {
            Parcelable parcelable3 = bundle.getParcelable("setting");
            if (!(parcelable3 instanceof NotificationsNotificationSettingRedesignDto)) {
                parcelable3 = null;
            }
            parcelable = (NotificationsNotificationSettingRedesignDto) parcelable3;
        }
        NotificationsNotificationSettingRedesignDto notificationsNotificationSettingRedesignDto = (NotificationsNotificationSettingRedesignDto) parcelable;
        int i2 = bundle.getInt("count", -1);
        if (i2 != -1) {
            redesignNotificationSettingsFragment.getFeature().C(new rf70.b(i2));
            return;
        }
        if (i != -1 && string != null) {
            redesignNotificationSettingsFragment.getFeature().C(new rf70.g(i, string));
        } else if (notificationsNotificationSettingRedesignDto != null) {
            redesignNotificationSettingsFragment.getFeature().C(new xf70(notificationsNotificationSettingRedesignDto));
        }
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
            case 4:
                break;
            case 7:
                break;
        }
        return ((Boolean) ((u5p0) this.c).invoke(obj)).booleanValue();
    }
}
