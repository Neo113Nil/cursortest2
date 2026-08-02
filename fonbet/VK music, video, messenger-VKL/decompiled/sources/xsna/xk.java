package xsna;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.PowerManager;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.material3.SheetValue;
import androidx.fragment.app.FragmentActivity;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vk.api.sdk.auth.UtilityTokens;
import com.vk.clips.favorites.api.di.ClipsFavoritesComponent;
import com.vk.clips.viewer.impl.grid.a;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachImage;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.Image;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.masks.Mask;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.photo.Photo;
import com.vk.dto.shortvideo.ClipsAuthor;
import com.vk.feed.design.view.newsfeed.avatar_stack.AvatarAnimatedStack;
import com.vk.feed.design.view.newsfeed.reaction.FeedAnimatedView;
import com.vk.geo.impl.model.BoundingBox;
import com.vk.geo.impl.model.CameraBounds;
import com.vk.geo.impl.model.MutableBoundingBox;
import com.vk.im.engine.models.attaches.AttachVideo;
import com.vk.music.onboarding.impl.MusicRecommendationOnboardingContract$Presenter;
import com.vk.newsfeed.impl.fragments.BaseCommentsFragment;
import com.vk.newsfeed.posting.music_picker.presentation.model.MusicPickerListItem;
import com.vk.newsfeed.posting.poll_editor.domain.model.PollEditorScreen;
import com.vk.permission.PermissionHelper;
import com.vk.reefton.dto.DeviceState;
import com.vk.reefton.dto.ReefBuildType;
import com.vk.reefton.trackers.c;
import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.base.js.bridge.Responses$ReasonInvalidParams;
import com.vk.superapp.base.js.bridge.Responses$ReasonUnsupportedPlatform;
import com.vk.superapp.common.js.bridge.api.events.AccelerometerStart$Parameters;
import com.vk.superapp.common.js.bridge.api.events.AccelerometerStart$Response;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vk.voip.ui.accessibility.AccessibilityEvents;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantCollection;
import xsna.dc3;
import xsna.egm;
import xsna.fis;
import xsna.hud0;
import xsna.i6w;
import xsna.ixe;
import xsna.k840;
import xsna.mah;
import xsna.nj8;
import xsna.o9t;
import xsna.pnb0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class xk implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ xk(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v106, types: [com.vk.music.onboarding.impl.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v64, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.String, xsna.zcl] */
    /* JADX WARN: Type inference failed for: r7v7, types: [xsna.q5v0] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r9v1, types: [com.vk.voip.ui.accessibility.AccessibilityEvents] */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v27 */
    @Override // xsna.gzs
    public final Object invoke() {
        String str;
        Uri parse;
        String str2;
        Uri parse2;
        s3q0 s3q0Var;
        ExposedFunction invoke$lambda$50;
        Context context;
        Float d;
        o0o0 o0o0Var;
        c.a aVar;
        TelephonyManager telephonyManager;
        ParticipantCollection participants;
        ConversationParticipant byExternal;
        int i = this.b;
        int i2 = 14;
        int i3 = 3;
        boolean z = true;
        r6 = false;
        r6 = false;
        boolean z2 = false;
        r7 = null;
        String str3 = null;
        Photo photo = null;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ?? r9 = (AccessibilityEvents) obj2;
                ArrayList arrayList = (ArrayList) obj;
                r9.c("usersStopScreenCast(" + arrayList.size() + ')');
                r9.b(AccessibilityEvents.Event.SCREEN_CAST_STOPPED, AccessibilityEvents.Event.SCREEN_CAST_STARTED, arrayList);
                return s3q0.a;
            case 1:
                ((izs) obj2).invoke(new ixe.r((ClipsAuthor) ((hud0.e) obj).b().a));
                return s3q0.a;
            case 2:
                final UserId userId = (UserId) obj2;
                final dc3.a aVar2 = (dc3.a) obj;
                if (o25.a().b()) {
                    final boolean a = o25.a().a(userId);
                    final String s = o25.a().s(userId);
                    final UtilityTokens v = o25.a().v();
                    asu0.a.getClass();
                    asu0.l().execute(new Runnable() { // from class: xsna.bc3
                        @Override // java.lang.Runnable
                        public final void run() {
                            String str4;
                            o25.a().O(new t200(Sdk.SDKError.Reason.INVALID_REQUEST_BUILDER_ERROR_VALUE, UserId.this, "deactivated", null, false, true, false));
                            if (!a || (str4 = s) == null) {
                                return;
                            }
                            ((Handler) aVar2.a.getValue()).postDelayed(new cc3(0, (Object) str4, (Object) v), 300L);
                        }
                    });
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 3:
                int i4 = BaseCommentsFragment.l0;
                ((afg) obj2).I8((iag) obj);
                return s3q0.a;
            case 4:
                ((jj8) obj2).m.invoke(((nj8.e) obj).c);
                return s3q0.a;
            case 5:
                Attach attach = (Attach) obj2;
                q8b q8bVar = (q8b) obj;
                if (attach instanceof AttachImage) {
                    AttachImage attachImage = (AttachImage) attach;
                    q8bVar.getClass();
                    File file = attachImage.l;
                    if (file == null || (parse2 = Uri.fromFile(file)) == null) {
                        ImageList imageList = attachImage.r;
                        Integer i5 = ixj0.i(attachImage.g().b);
                        int intValue = i5 != null ? i5.intValue() : -1;
                        Integer g = ixj0.g(attachImage.g().b);
                        Image Bb = imageList.Bb(intValue, g != null ? g.intValue() : -1);
                        if (Bb == null || (str2 = Bb.d) == null) {
                            return null;
                        }
                        parse2 = Uri.parse(str2);
                    }
                    return mcr0.h(parse2).a();
                }
                if (!(attach instanceof AttachVideo)) {
                    return null;
                }
                AttachVideo attachVideo = (AttachVideo) attach;
                q8bVar.getClass();
                String str4 = attachVideo.m;
                if (str4.length() <= 0) {
                    str4 = null;
                }
                if (str4 == null || (parse = Uri.parse(str4)) == null) {
                    Image Bb2 = attachVideo.f.Bb(attachVideo.b.getWidth(), attachVideo.b.getHeight());
                    if (Bb2 == null || (str = Bb2.d) == null) {
                        return null;
                    }
                    parse = Uri.parse(str);
                }
                return mcr0.h(parse).a();
            case 6:
                return m5e.a(((ClipsFavoritesComponent) ((com.vk.clips.viewer.impl.grid.a) obj2).b.getValue()).b8(), o25.a().c(), ((a.C0712a) obj).a, 14).f();
            case 7:
                khg khgVar = (khg) obj2;
                Intent intent = (Intent) obj;
                q5v0 q5v0Var = k840.a.g;
                (q5v0Var != null ? q5v0Var : 0).a(new eqd(intent, khgVar));
                return s3q0.a;
            case 8:
                s3q0Var = CommonInitAwaitingGetHeaderBiddingToken.tokenSuccess$lambda$0((CommonInitAwaitingGetHeaderBiddingToken) obj2, (String) obj);
                return s3q0Var;
            case 9:
                ((mah.a) obj2).q6((mah) obj, true);
                return s3q0.a;
            case 10:
                cpk cpkVar = (cpk) obj2;
                Mask mask = (Mask) obj;
                cpkVar.e.b();
                kpk kpkVar = (kpk) cpkVar.g.b.getValue();
                fpk fpkVar = kpkVar.c;
                int i6 = mask.d;
                int i7 = fpkVar.b.getInt(fpk.a(i6), 0);
                SharedPreferences sharedPreferences = fpkVar.b;
                sharedPreferences.edit().remove(fpk.b(sharedPreferences.getInt(fpk.a(i6), 0))).remove(fpk.a(i6)).apply();
                io.reactivex.rxjava3.kotlin.c.f(6, rsg0.y0(new rea0(kpkVar.b, i7), null, null, 3), null, new db(28), null);
                ReentrantLock reentrantLock = kpkVar.d;
                reentrantLock.lock();
                try {
                    Iterator it = kpkVar.e.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            ?? next = it.next();
                            if (((Photo) next).c == i7) {
                                photo = next;
                            }
                        }
                    }
                    Photo photo2 = photo;
                    if (photo2 != null) {
                        kpkVar.e.remove(photo2);
                        kpkVar.f.onNext(kpkVar.a(kpkVar.e));
                    }
                    s3q0 s3q0Var2 = s3q0.a;
                    reentrantLock.unlock();
                    cpkVar.f.c.invoke(mask);
                    return s3q0.a;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            case 11:
                hgm hgmVar = (hgm) obj2;
                ?? r0 = (ViewGroup) obj;
                VkImageSimple vkImageSimple = new VkImageSimple(hgmVar.d, null, 6, 0);
                vkImageSimple.setId(R.id.dialog_item_unread_out_icon);
                Pair pair = new Pair(Integer.valueOf(R.drawable.vk_icon_check_outline_16), Integer.valueOf(R.attr.vk_ui_icon_accent_themed));
                omw.d(vkImageSimple, ((Number) pair.d()).intValue(), ((Number) pair.g()).intValue());
                vkImageSimple.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                vkImageSimple.setContentDescription(null);
                egm.b bVar = hgmVar.m;
                vkImageSimple.setLayoutParams(egm.W(hgmVar, (bVar != null ? bVar : null).g, (bVar != null ? bVar : null).g, (bVar != null ? bVar : null).h, 0, 0, 0, 56));
                r0.addView(vkImageSimple);
                return vkImageSimple;
            case 12:
                List list = (List) obj;
                AvatarAnimatedStack avatarAnimatedStack = (AvatarAnimatedStack) ((Ref$ObjectRef) obj2).element;
                if (avatarAnimatedStack != null) {
                    avatarAnimatedStack.a("https://vk.ru/reaction/3-reactions-0?c_uniq_tag=c0390bed2f5fe4bef86e18a800618094e818e47ec5210c33d15d298e27829c5e", list);
                    if (!avatarAnimatedStack.n) {
                        avatarAnimatedStack.m = true;
                        if (avatarAnimatedStack.l) {
                            FeedAnimatedView feedAnimatedView = avatarAnimatedStack.d;
                            if (!feedAnimatedView.x) {
                                feedAnimatedView.setAnimating(true);
                            }
                        }
                    }
                }
                return s3q0.a;
            case 13:
                ((izs) obj2).invoke(new fis.b((jis) obj));
                return s3q0.a;
            case 14:
                ((izs) obj2).invoke(new o9t.m(ydt.b((xdt) obj)));
                return s3q0.a;
            case 15:
                StringBuilder sb = new StringBuilder("debounce_observing: canLoadNewContent=true, cameraBounds=");
                Parcelable.Creator<BoundingBox> creator = BoundingBox.CREATOR;
                sb.append(((CameraBounds) obj2).geoJsonString(true));
                sb.append(", old=");
                MutableBoundingBox mutableBoundingBox = (MutableBoundingBox) ((Ref$ObjectRef) obj).element;
                sb.append(mutableBoundingBox != null ? mutableBoundingBox.geoJsonString(true) : null);
                return sb.toString();
            case 16:
                invoke$lambda$50 = HandleInvocationsFromAdViewer.invoke$lambda$50((HandleInvocationsFromAdViewer) obj2, (AdObject) obj);
                return invoke$lambda$50;
            case 17:
                return "ImItemList.Debug Actor: findDialog returned null for peer=" + ((i6w.i) obj2).b + ", state items count=" + ((o6w) ((j6w) obj).b.getCurrentState()).c.b.a.size();
            case 18:
                AccelerometerStart$Parameters accelerometerStart$Parameters = (AccelerometerStart$Parameters) obj2;
                c1y c1yVar = (c1y) obj;
                svp svpVar = c1yVar.c;
                String e = accelerometerStart$Parameters != null ? accelerometerStart$Parameters.e() : null;
                try {
                    context = ((x6y) c1yVar.d.c).l;
                } catch (Throwable th2) {
                    svpVar.a(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, th2.getMessage(), null, null, null, null, new Responses$ReasonInvalidParams(r6 ? 1 : 0, r7, i3, r7), null, null, null, null, null, null, null, null, null, null, 131004, null), e, 1, null));
                }
                if (context == null) {
                    throw new IllegalStateException("The bridge has no context");
                }
                if (!uvg0.a(1, context)) {
                    svpVar.a(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_UNSUPPORTED_PLATFORM, null, null, null, null, null, null, new Responses$ReasonUnsupportedPlatform(r6 ? 1 : 0, r7, i3, r7), null, null, null, null, null, null, null, null, null, 130940, null), e, 1, null));
                    return s3q0.a;
                }
                Integer valueOf = (accelerometerStart$Parameters == null || (d = accelerometerStart$Parameters.d()) == null) ? null : Integer.valueOf((int) d.floatValue());
                if (valueOf != null) {
                    int intValue2 = valueOf.intValue();
                    if ((20 <= intValue2 && intValue2 < 1001) == false) {
                        svpVar.a(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, null, null, null, null, null, new Responses$ReasonInvalidParams(r6 ? 1 : 0, r7, i3, r7), null, null, null, null, null, null, null, null, null, null, 131004, null), e, 1, null));
                        return s3q0.a;
                    }
                }
                c1yVar.t(context, valueOf, new j21(r6 ? (byte) 1 : (byte) 0, 10), new rm0(15, c1yVar, e));
                com.vk.superapp.base.js.bridge.b.p(c1yVar.b.a, new JsMethod("VKWebAppAccelerometerStart"), new AccelerometerStart$Response(null, new AccelerometerStart$Response.Data(true, e), e, 1, null), null, null, false, null, 60);
                return s3q0.a;
            case 19:
                gdj0 gdj0Var = (gdj0) obj2;
                yvj yvjVar = (yvj) obj;
                if (gdj0Var.d.d.invoke(SheetValue.PartiallyExpanded).booleanValue()) {
                    myc0.h(yvjVar, null, null, new ox20(gdj0Var, null), 3);
                }
                return Boolean.TRUE;
            case 20:
                return new SimpleDateFormat(((Context) obj2).getString(R.string.vkim_msg_list_time_etc), ((dn30) obj).e);
            case 21:
                ((izs) obj2).invoke(new sr40(((MusicPickerListItem.MusicPlaylistItem) ((MusicPickerListItem) obj)).b));
                return s3q0.a;
            case 22:
                MusicRecommendationOnboardingContract$Presenter musicRecommendationOnboardingContract$Presenter = (MusicRecommendationOnboardingContract$Presenter) obj2;
                ((com.vk.music.pref.a) musicRecommendationOnboardingContract$Presenter.f.getValue()).u();
                musicRecommendationOnboardingContract$Presenter.c.je((String) obj);
                return s3q0.a;
            case 23:
                rtg0 rtg0Var = (rtg0) obj;
                PermissionHelper permissionHelper = PermissionHelper.a;
                permissionHelper.getClass();
                PermissionHelper.l(permissionHelper, (FragmentActivity) obj2, PermissionHelper.b, new atm(rtg0Var, 27), new bzw(rtg0Var, i2), 4);
                return s3q0.a;
            case 24:
                pha0 pha0Var = (pha0) obj2;
                via0 via0Var = (via0) obj;
                if (pha0Var.o != null && (o0o0Var = pha0Var.i) != null) {
                    o0o0Var.d(via0Var);
                }
                return s3q0.a;
            case 25:
                ((ujb0) obj2).m6((MusicTrack) obj);
                return s3q0.a;
            case 26:
                ((izs) obj2).invoke(new pnb0.c.g(new PollEditorScreen.PollDatePicker(((Calendar) obj).getTimeInMillis())));
                return s3q0.a;
            case 27:
                com.vk.reefton.trackers.c cVar = (com.vk.reefton.trackers.c) obj2;
                vof0 vof0Var = (vof0) obj;
                fnf0 fnf0Var = cVar.a;
                Context context2 = cVar.d;
                if (fnf0Var.a() >= 29 && (telephonyManager = cVar.b) != null) {
                    str3 = telephonyManager.getTypeAllocationCode();
                }
                String str5 = str3;
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - cVar.g < com.vk.reefton.trackers.c.h) {
                    aVar = cVar.f;
                } else {
                    c.a a2 = cVar.e.a(context2);
                    cVar.f = a2;
                    cVar.g = currentTimeMillis;
                    aVar = a2;
                }
                boolean z3 = Settings.Global.getInt(context2.getContentResolver(), "airplane_mode_on", 0) != 0;
                String h = fnf0Var.h();
                DeviceState.Type type = DeviceState.Type.PHONE;
                String str6 = Build.MANUFACTURER;
                String str7 = str6 == null ? "" : str6;
                String str8 = Build.MODEL;
                String str9 = str8 == null ? "" : str8;
                String valueOf2 = String.valueOf(fnf0Var.a());
                String d2 = fnf0Var.d();
                ReefBuildType e2 = fnf0Var.e();
                PowerManager powerManager = cVar.c;
                vof0Var.a(new DeviceState(h, type, str7, str9, valueOf2, "8.188.1", d2, e2, str5, powerManager != null ? powerManager.isPowerSaveMode() : false, aVar != null ? aVar.a : false, aVar != null ? aVar.b : -1.0f, z3));
                return s3q0.a;
            case 28:
                ((uhj0) obj2).x(((com.vkontakte.android.actionlinks.a) obj).e);
                return s3q0.a;
            default:
                CallMemberId callMemberId = (CallMemberId) obj;
                Conversation conversation = ((clj0) obj2).a.d().c.getConversation();
                if (conversation != null && (participants = conversation.getParticipants()) != null && (byExternal = participants.getByExternal(mnh0.H(callMemberId))) != null) {
                    z2 = byExternal.isUseable();
                }
                return Boolean.valueOf(z2);
        }
    }
}
