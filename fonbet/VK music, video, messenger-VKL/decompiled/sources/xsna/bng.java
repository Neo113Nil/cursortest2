package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import com.vk.attachpicker.PhotoVideoAttachActivity;
import com.vk.core.preference.Preference;
import com.vk.core.ui.bottomsheet.internal.e;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Link;
import com.vk.dto.polls.GradientPoint;
import com.vk.dto.polls.Poll;
import com.vk.dto.polls.PollBackground;
import com.vk.dto.polls.PollGradient;
import com.vk.dto.stories.entities.StoryCameraGalleryData;
import com.vk.dto.stories.model.CommonUploadParams;
import com.vk.dto.stories.model.ExternalAdsInfo;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StorySessionParams;
import com.vk.dto.stories.model.StoryUploadParams;
import com.vk.dto.stories.model.StoryViewAction;
import com.vk.dto.stories.model.clickable.ClickablePoll;
import com.vk.gallerypicker.configuration.GalleryPickerSourceConfiguration;
import com.vk.log.L;
import com.vk.media.MediaFilteringStrategy;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsStoriesStat$TypeStoryPublishItem;
import com.vk.stat.scheme.SchemeStat$TypeQuestionItem;
import com.vk.stories.StorySettingsActivity;
import com.vk.stories.design.view.polls.SimplePollView;
import com.vk.story.archive.impl.presentation.StoryArchiveFragment;
import com.vk.storycamera.screen.StoryGalleryActivity;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.dw20;
import xsna.krl0;
import xsna.ky6;
import xsna.mg10;

/* compiled from: CommonStoriesBridge.kt */
/* loaded from: classes7.dex */
public final class bng implements krl0 {
    public static final bng b = new bng();

    @Override // xsna.krl0
    public final void a(Context context, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint) {
        int i = StorySettingsActivity.P;
        Intent intent = new Intent(context, (Class<?>) StorySettingsActivity.class);
        intent.putExtra("INTENT_VIEW_ENTRY_POINT", mobileOfficialAppsConStoriesStat$ViewEntryPoint);
        context.startActivity(intent);
    }

    @Override // xsna.krl0
    public final void b(Context context, UserId userId, String str, String str2) {
        new StoryArchiveFragment.a(userId, str, str2).k(context);
    }

    @Override // xsna.krl0
    public final boolean d() {
        o2l.a.getClass();
        return o2l.b("__dbg_visible_recognitions", false);
    }

    @Override // xsna.krl0
    public final String e(CommonUploadParams commonUploadParams, StoryUploadParams storyUploadParams) {
        return nf9.b.d(commonUploadParams, storyUploadParams);
    }

    @Override // xsna.krl0
    public final void f(Context context, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, MobileOfficialAppsStoriesStat$TypeStoryPublishItem.CreationEntryPoint creationEntryPoint, List<String> list) {
        com.vk.storycamera.builder.a aVar = new com.vk.storycamera.builder.a(mobileOfficialAppsCoreNavStat$EventScreen, creationEntryPoint);
        List H0 = j5g.H0(list, 10);
        ArrayList arrayList = new ArrayList(c5g.u(H0, 10));
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            arrayList.add(new StoryCameraGalleryData(jeq0.g((String) it.next()), true, false, false, 12, null));
        }
        aVar.G = arrayList;
        aVar.m0 = true;
        aVar.C(context);
    }

    @Override // xsna.krl0
    public final boolean g(krl0.b bVar, t9 t9Var, t40 t40Var) {
        int i;
        o1d o1dVar = bVar.a;
        final jmm0 jmm0Var = new jmm0(o1dVar, "clips_view", bVar.b);
        jmm0Var.e = t9Var;
        jmm0Var.f = t40Var;
        ClickablePoll clickablePoll = bVar.c;
        Activity c = g2u0.c(o1dVar);
        if (c == null) {
            L.e("StoryViewPollDelegate", "onStickerClicked не может быть обработан. Переданный аргумент view в класс StoryViewPollDelegate не содержит ссылку на activity, а для ModalBottomSheet.Builder потребуется activity context");
            return false;
        }
        Poll poll = clickablePoll.e.b;
        if (poll == null) {
            return false;
        }
        float f = 8;
        int a = iah0.a(f);
        PollBackground pollBackground = poll.s;
        if (pollBackground instanceof PollGradient) {
            List<GradientPoint> list = ((PollGradient) pollBackground).e;
            Iterator<T> it = list.iterator();
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (it.hasNext()) {
                int i5 = ((GradientPoint) it.next()).b;
                i2 += Color.red(i5) / list.size();
                i3 += Color.green(i5) / list.size();
                i4 += Color.blue(i5) / list.size();
            }
            i = Color.argb(255, i2, i3, i4);
        } else {
            i = pollBackground != null ? pollBackground.c : -1;
        }
        SimplePollView simplePollView = new SimplePollView(jmm0Var.d, null);
        ukl uklVar = new ukl();
        simplePollView.j0 = uklVar;
        simplePollView.k0 = uklVar;
        simplePollView.addOnAttachStateChangeListener(new trj0(simplePollView));
        simplePollView.setSmallRectVisible(true);
        simplePollView.setVoteContext(jmm0Var.b);
        simplePollView.setPollViewCallback(jmm0Var.i);
        simplePollView.f(poll, false);
        simplePollView.setRef("STORY".toLowerCase(Locale.ROOT));
        simplePollView.setTrackCode(jmm0Var.c);
        simplePollView.measure(View.MeasureSpec.makeMeasureSpec(iah0.f().widthPixels, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        boolean z = ((float) simplePollView.getMeasuredHeight()) > ((float) iah0.f().heightPixels) * 0.9f;
        if (z) {
            simplePollView.m = 0;
            simplePollView.n = 0;
            simplePollView.f(poll, false);
        } else {
            simplePollView.setPadding(a, a, a, a);
        }
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        dw20.b l = new dw20.b(c, null).l(i);
        int a2 = iah0.a(f);
        l.getClass();
        l.d.x0 = a2;
        dw20.b Z = l.e0(new su9(jmm0Var, ref$ObjectRef)).Z(new DialogInterface.OnDismissListener() { // from class: xsna.hmm0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                t40 t40Var2 = jmm0.this.f;
                Object obj = ref$ObjectRef.element;
                if (t40Var2 == null || obj == null) {
                    return;
                }
                t40Var2.invoke((fcn) obj);
            }
        });
        String str = poll.d;
        Z.getClass();
        e.a aVar = Z.d;
        aVar.Q = str;
        aVar.b0 = true;
        dw20.b D0 = Z.D0(simplePollView, false);
        dw20.b bVar2 = D0;
        if (z) {
            bVar2.c(new ts90(1.0f, 2));
            bVar2.R0(true);
        }
        D0.I0(null);
        jmm0Var.g = clickablePoll;
        return true;
    }

    @Override // xsna.krl0
    public final boolean h(boolean z, String str, Boolean bool, w2j0 w2j0Var) {
        if (bool != null) {
            ysg0.b.a(new mg10.b(str, bool.booleanValue()));
            return true;
        }
        if (!z) {
            return false;
        }
        ysg0.b.a(new mg10.a(str));
        w2j0Var.invoke();
        return true;
    }

    @Override // xsna.krl0
    public final StorySessionParams i() {
        nf9 nf9Var = nf9.b;
        Long id = nf9.e().b().getId();
        String name = nf9.e().d().e().a.name();
        Locale locale = Locale.ROOT;
        return new StorySessionParams(id, name.toLowerCase(locale), nf9.e().d().e().b.name().toLowerCase(locale));
    }

    @Override // xsna.krl0
    public final void j() {
        j5t.a();
        if (j5t.d == 0) {
            return;
        }
        j5t.d = 0;
        ky6.a aVar = (ky6.a) Preference.j().edit();
        aVar.putInt("gallery_bucket", 0);
        aVar.a();
    }

    @Override // xsna.krl0
    public final Intent k(StoryGalleryActivity storyGalleryActivity) {
        Intent intent = new Intent(storyGalleryActivity, (Class<?>) PhotoVideoAttachActivity.class);
        intent.putExtra("media_type", 111);
        intent.putExtra("camera_enabled", false);
        intent.putExtra("long_previews", true);
        intent.putExtra("short_divider", true);
        intent.putExtra("prevent_styling_photo", false);
        intent.putExtra("prevent_styling_video", false);
        intent.putExtra("video_filtering_mode", MediaFilteringStrategy.VIDEO_AVC);
        intent.putExtra("story_trim_end_position", 60000L);
        intent.putExtra("single_mode", false);
        intent.putExtra("video_max_length_ms", TimeUnit.MINUTES.toMillis(3L));
        intent.putExtra("show_story_camera", true);
        intent.putExtra("gallery_picker_source_configuration", new GalleryPickerSourceConfiguration(false, false, GalleryPickerSourceConfiguration.EntryPoint.STORY, true, false, false, false, false, null, 499, null));
        return intent;
    }

    @Override // xsna.krl0
    public final void l(Integer num) {
        mpe0.a(SchemeStat$TypeQuestionItem.Type.SHARE_TO_STORY, null, o25.a().c(), num, null, null);
    }

    @Override // xsna.krl0
    public final String m(int i) {
        return udm0.b(i, null);
    }

    @Override // xsna.krl0
    public final void n(Context context, StoryEntry storyEntry) {
        HashMap hashMap = s21.a;
        ExternalAdsInfo externalAdsInfo = storyEntry.m0;
        if (externalAdsInfo == null) {
            return;
        }
        String str = externalAdsInfo.e;
        s21.v().a(StoryViewAction.CLICK, storyEntry);
        String str2 = com.vkontakte.android.data.b.h().r;
        boolean i = dy2.i(str);
        tm0 tm0Var = new tm0(storyEntry, 2);
        if (!TextUtils.isEmpty(str) && i) {
            s21.s(context, null, storyEntry.u, externalAdsInfo.e, externalAdsInfo.f, storyEntry.T, i, -1, new bb(storyEntry, 3), new o21(0, str2, tm0Var));
        } else {
            s21.y("ads/click_open_link_url", null, str2, tm0Var);
            s21.u(context, externalAdsInfo.d, storyEntry.T);
        }
    }

    @Override // xsna.krl0
    public final void o(Context context, String str, String str2, String str3, boolean z, StoryEntry storyEntry) {
        s21.v().a(StoryViewAction.CLICK, storyEntry);
        Link link = new Link(str3, z ? 0 : 2);
        boolean i = dy2.i(str);
        String str4 = com.vkontakte.android.data.b.h().r;
        if (TextUtils.isEmpty(str) || !i) {
            s21.u(context, link.c, str3);
        } else {
            s21.s(context, null, storyEntry.u, str, str2, str3, true, -1, new h20(storyEntry, 2), new n21(0));
        }
    }

    @Override // xsna.krl0
    public final io.reactivex.rxjava3.core.x<File> p(String str, String str2) {
        new io.reactivex.rxjava3.disposables.b();
        return new io.reactivex.rxjava3.internal.operators.single.c(new v850(str2, str));
    }

    @Override // xsna.krl0
    public final void q(Context context, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, ListBuilder listBuilder) {
        com.vk.storycamera.builder.a aVar = new com.vk.storycamera.builder.a(mobileOfficialAppsCoreNavStat$EventScreen, MobileOfficialAppsStoriesStat$TypeStoryPublishItem.CreationEntryPoint.MESSAGE_REPOST);
        aVar.B0 = listBuilder;
        aVar.m0 = true;
        aVar.C(context);
    }
}
