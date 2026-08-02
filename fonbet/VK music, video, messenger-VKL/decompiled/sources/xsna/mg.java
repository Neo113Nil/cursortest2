package xsna;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import com.vk.biometrics.lock.impl.presentation.base.mvi.settings.BiometricsLockSettingsFragment;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.im.ui.components.contacts.ContactsListFactory;
import com.vk.im.ui.views.msg.bubble.FloatingBubbleFluidLayout;
import com.vk.music.player.analytics.impl.tracker.di.AbstractPlayerAnalyticsComponent;
import com.vk.newsfeed.impl.presentation.from_notifications.presentation.fragment.PostsFromNotificationsFragment;
import com.vk.photo.editor.PhotoEditorView;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.superapp.advertisement.di.fullscreen_ad.FullscreenAdFactoryComponentImpl;
import com.vkontakte.android.R;
import xsna.bbv0;
import xsna.cex;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class mg implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ mg(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                qcy<Object>[] qcyVarArr = AbstractPlayerAnalyticsComponent.g;
                break;
            case 1:
                Context context = e43.a;
                break;
            case 2:
                int i = BiometricsLockSettingsFragment.Y;
                break;
            case 5:
                int i2 = ClipFeedListFragment.a2;
                break;
            case 7:
                ContactsListFactory contactsListFactory = ContactsListFactory.CREATE_CONVERSATION_VKME;
                break;
            case 12:
                int i3 = FloatingBubbleFluidLayout.j;
                Paint paint = new Paint();
                paint.setColor(0);
                paint.setDither(true);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                break;
            case 13:
                qcy<Object>[] qcyVarArr2 = FullscreenAdFactoryComponentImpl.b;
                break;
            case 15:
                int[] iArr = {n8g.l(-16777216, 102), n8g.l(-16777216, 96), n8g.l(-16777216, 81), n8g.l(-16777216, 20), n8g.l(-16777216, 5), n8g.l(-16777216, 0)};
                cex.a aVar = cex.a.a;
                break;
            case 21:
                bbv0.g.getClass();
                bbv0.a.f().d.i();
                break;
            case 22:
                int i4 = PhotoEditorView.c0;
                break;
            case 23:
                break;
            case 24:
                qcy<Object>[] qcyVarArr3 = PostsFromNotificationsFragment.p0;
                break;
            case 26:
                Context context2 = e43.a;
                if (context2 == null) {
                    context2 = null;
                }
                int a = e3m.a(R.dimen.vkim_reactions_avatar_size, context2);
                Context context3 = e43.a;
                break;
            case 27:
                RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                frf0.g(SchemeStatSak$EventScreen.LK_PASSWORD, null, null, null, 12);
                break;
        }
        return s3q0.a;
    }
}
