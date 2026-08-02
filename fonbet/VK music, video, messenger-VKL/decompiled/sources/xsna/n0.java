package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.opengl.GLES20;
import android.util.Log;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import androidx.activity.result.ActivityResult;
import androidx.fragment.app.FragmentActivity;
import com.unity3d.services.UnityAdsConstants;
import com.vk.camera.clips.api.di.CameraClipsComponent;
import com.vk.clips.edit.di.ClipEditComponent;
import com.vk.clips.sdk.shared.item.common.restriction.RestrictionOverlayRenderDelegate;
import com.vk.clips.viewer.impl.grid.lists.fragments.ClipsGridDraftsListFragment;
import com.vk.core.design.lego.LegoCustomRedesignedScreen;
import com.vk.core.view.mediapicker.VkMediaPicker;
import com.vk.dto.common.VideoFile;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.ecomm.design.compose.tile.MarketProductTileConfig;
import com.vk.games.presentation.catalog.GamesCatalogFragment;
import com.vk.geo.impl.model.id.StringId;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.sync.ImBgSyncMode;
import com.vk.lists.ListDataSet;
import com.vk.mediapicker.api.models.MediaPickerConfiguration;
import com.vk.mediapicker.api.models.MediaPickerFragmentArguments;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.messagetemplates.impl.details.f;
import com.vk.music.view.vkmix.gl.GLShaderId;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.domain.model.PostingStepScreen;
import com.vk.newsfeed.posting.impl.domain.model.upload.UploadDto;
import com.vk.newsfeed.posting.impl.presentation.model.FileDto;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.profile.core.tabs.state.CommunityProfileContent;
import com.vk.profile.user.impl.ui.UserProfileFragment;
import com.vk.profile.user.impl.ui.adapter.UserProfileAdapterItem;
import com.vk.profile.user.impl.ui.f;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.scheme.SchemeStat$TypeMiniAppItem;
import com.vk.superapp.api.states.VkAuthState;
import com.vkontakte.android.R;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.ok.gl.tf.Tensorflow;
import xsna.a8a;
import xsna.b3q0;
import xsna.dw20;
import xsna.dz40;
import xsna.ikv0;
import xsna.mat;
import xsna.nqq0;
import xsna.o9t;
import xsna.r5;
import xsna.su10;
import xsna.sx40;
import xsna.u86;
import xsna.ugf;
import xsna.vm30;
import xsna.xn50;
import xsna.yc1;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class n0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ n0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v21, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r1v26, types: [xsna.j8i, xsna.xwb$a] */
    /* JADX WARN: Type inference failed for: r1v32, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v64, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v66, types: [xsna.ou10] */
    /* JADX WARN: Type inference failed for: r1v81, types: [T, xsna.dw20] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v44, types: [com.vk.profile.user.impl.ui.adapter.UserProfileAdapterItem$b] */
    /* JADX WARN: Type inference failed for: r6v20, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v26, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v30, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        Object obj;
        long j;
        Integer num;
        UploadDto.UploadState I4;
        lb0 activityResultRegistry;
        MediaPickerFragmentArguments.CellAspectRation cellAspectRation;
        MediaPickerConfiguration.MultiSelectMode multiSelectMode;
        hah0 hah0Var;
        UserProfileAdapterItem.e eVar;
        int i = this.b;
        int i2 = 5;
        int i3 = 3;
        int i4 = 8;
        int i5 = 9;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                o0 o0Var = (o0) obj2;
                String value = ((b2t) ((we0) obj3).c).a(GLShaderId.Aberration).getValue();
                int glCreateShader = GLES20.glCreateShader(35632);
                GLES20.glShaderSource(glCreateShader, value);
                GLES20.glCompileShader(glCreateShader);
                IntBuffer allocate = IntBuffer.allocate(1);
                GLES20.glGetShaderiv(glCreateShader, 35713, allocate);
                if (allocate.get(0) == 0) {
                    Log.e("createShader", GLES20.glGetShaderInfoLog(glCreateShader));
                }
                return new ch7(((Number) o0Var.d.getValue()).intValue(), glCreateShader);
            case 1:
                r5.a aVar = (r5.a) obj3;
                View view = (View) obj2;
                aVar.getClass();
                Object parent = view.getParent();
                View view2 = parent instanceof View ? (View) parent : null;
                if (view2 == null) {
                    view2 = view;
                }
                f4m.v((int) ((1.0f - r5.l1.a(aVar.c)) * view2.getHeight()), view.findViewById(R.id.recycler));
                return s3q0.a;
            case 2:
                bwt0.j((ImageView) obj3, new pz((w60) obj2, 1));
                return s3q0.a;
            case 3:
                return new RestrictionOverlayRenderDelegate(((b11) ((zy0) obj3).a.getValue()).e, new ec((ux0) obj2, i3));
            case 4:
                ((izs) obj3).invoke(new yc1.c(((wq1) obj2).b));
                return s3q0.a;
            case 5:
                u86 u86Var = (u86) obj3;
                u86Var.O();
                Ref$IntRef ref$IntRef = new Ref$IntRef();
                ref$IntRef.element = u86Var.getMeasuredWidth();
                Ref$IntRef ref$IntRef2 = new Ref$IntRef();
                ref$IntRef2.element = u86Var.getMeasuredHeight();
                f4m.a(u86Var, new u86.b(u86Var, ref$IntRef, ref$IntRef2, u86Var, (u76) obj2));
                return s3q0.a;
            case 6:
                ((izs) obj3).invoke((VideoFile) obj2);
                return s3q0.a;
            case 7:
                r2a r2aVar = (r2a) obj2;
                xvy xvyVar = ((d8a) obj3).b;
                Iterator it = xvyVar.j().f().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (epx.f(((xuy) obj).getKey(), r2aVar.w())) {
                        }
                    } else {
                        obj = null;
                    }
                }
                xuy xuyVar = (xuy) obj;
                float min = xuyVar != null ? (Math.min(xuyVar.getSize() + xuyVar.getOffset(), r2.h()) - Math.max(xuyVar.getOffset(), r2.g())) / xuyVar.getSize() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                long j2 = 0 << 32;
                long g = (r2.g() & 4294967295L) | j2;
                long h = (r2.h() & 4294967295L) | j2;
                if (xuyVar != null) {
                    j = h;
                    num = Integer.valueOf(xuyVar.getIndex());
                } else {
                    j = h;
                    num = null;
                }
                return new a8a.a(min, g, j, num, null, xuyVar != null ? new h9x((xuyVar.getOffset() & 4294967295L) | j2) : null, xvyVar.j.a(), 16);
            case 8:
                ((xwb) obj3).b.Z((ph90) obj2);
                return s3q0.a;
            case 9:
                sae saeVar = (sae) obj3;
                View view3 = (View) obj2;
                com.vk.movika.sdk.android.defaultplayer.interactive.a aVar2 = new com.vk.movika.sdk.android.defaultplayer.interactive.a(saeVar, 22);
                ViewPropertyAnimator animate = view3.animate();
                float f = saeVar.i;
                animate.scaleX(f).scaleY(f).setDuration(saeVar.d).setInterpolator(saeVar.g).setStartDelay(saeVar.e).setListener(new rae(view3, saeVar, aVar2, 0)).start();
                return s3q0.a;
            case 10:
                ClipsGridDraftsListFragment clipsGridDraftsListFragment = (ClipsGridDraftsListFragment) obj3;
                int i6 = ClipsGridDraftsListFragment.l0;
                int i7 = 10;
                clipsGridDraftsListFragment.P.b(new io.reactivex.rxjava3.internal.operators.single.o(((CameraClipsComponent) clipsGridDraftsListFragment.f0.getValue()).e1().b((String) obj2).e(((CameraClipsComponent) clipsGridDraftsListFragment.f0.getValue()).e1().a()), new qz(new pz(clipsGridDraftsListFragment, 20), i5)).subscribe(new bf2(new yad(clipsGridDraftsListFragment, i2), i7), new k5(new kz0(i7), 13)));
                return s3q0.a;
            case 11:
                wcf wcfVar = (wcf) obj3;
                q7v0 q7v0Var = (q7v0) obj2;
                VkOnboardingCampaign e = wcfVar.t.e("clips:vk_ticket_action_button");
                wcfVar.e(new ugf.g.l((e == null || !q7v0Var.d(e)) ? false : q7v0Var.b(e, false)));
                return s3q0.a;
            case 12:
                ((gzs) obj3).invoke();
                dw20 dw20Var = ((ryh) obj2).g;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                return s3q0.a;
            case 13:
                FileDto fileDto = (FileDto) obj3;
                izs izsVar = (izs) obj2;
                if (((fileDto == null || (I4 = fileDto.I4()) == null) ? null : I4.b) instanceof UploadDto.UploadStep.Failed) {
                    izsVar.invoke(new PostingAction.Upload.UploadRetry(fileDto));
                } else {
                    izsVar.invoke(new PostingAction.Navigation.OpenInCurrentStep(PostingStepScreen.FilePicker.b));
                }
                return s3q0.a;
            case 14:
                return new GestureDetector(((ViewGroup) obj3).getContext(), ((cdr) obj2).w);
            case 15:
                GamesCatalogFragment gamesCatalogFragment = (GamesCatalogFragment) obj3;
                int i8 = GamesCatalogFragment.i0;
                w9t fo = gamesCatalogFragment.fo();
                SchemeStat$TypeMiniAppItem.Type type = SchemeStat$TypeMiniAppItem.Type.GAMES_CLICK_OPEN_PWA;
                fo.getClass();
                w9t.e(type);
                xn50.a.c(gamesCatalogFragment, new o9t.k((zct) obj2));
                return s3q0.a;
            case 16:
                ((izs) obj3).invoke(new mat.a((h8t) obj2));
                return s3q0.a;
            case 17:
                return "#doStartBgSync. SyncMode: " + ((ImBgSyncMode) obj3) + ". Start cause: " + ((String) obj2);
            case 18:
                izs izsVar2 = (izs) obj3;
                MarketProductTileConfig marketProductTileConfig = (MarketProductTileConfig) obj2;
                if (izsVar2 != null) {
                    izsVar2.invoke(new MarketProductTileConfig.f(marketProductTileConfig.a));
                }
                return s3q0.a;
            case 19:
                su10 su10Var = (su10) obj3;
                final ?? r11 = (Context) obj2;
                final ?? r1 = (ou10) su10Var.b.getValue();
                if (r1 != 0) {
                    sb0 sb0Var = r11 instanceof sb0 ? (sb0) r11 : null;
                    if (sb0Var != null && (activityResultRegistry = sb0Var.getActivityResultRegistry()) != null) {
                        nb0 d = activityResultRegistry.d("media_picker_result", new cb0(), new ua0() { // from class: xsna.qu10
                            @Override // xsna.ua0
                            public final void onActivityResult(Object obj4) {
                                List<MediaStoreEntry> a = ou10.this.a((ActivityResult) obj4);
                                if (a.isEmpty()) {
                                    return;
                                }
                                ikv0.a aVar3 = new ikv0.a(r11);
                                aVar3.u = new ikv0.d("Selected " + a.size() + " items", (String) null, (ikv0.d.a) null, 6);
                                aVar3.n();
                            }
                        });
                        boolean booleanValue = ((Boolean) ((zak0) su10Var.l).getValue()).booleanValue();
                        boolean booleanValue2 = ((Boolean) ((zak0) su10Var.k).getValue()).booleanValue();
                        int i9 = su10.b.$EnumSwitchMapping$0[((VkMediaPicker.CellAspectRation) ((zak0) su10Var.n).getValue()).ordinal()];
                        if (i9 == 1) {
                            cellAspectRation = MediaPickerFragmentArguments.CellAspectRation.Square;
                        } else {
                            if (i9 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            cellAspectRation = MediaPickerFragmentArguments.CellAspectRation.Vertical;
                        }
                        MediaPickerFragmentArguments.CellAspectRation cellAspectRation2 = cellAspectRation;
                        MediaPickerConfiguration.MediaType mediaType = (MediaPickerConfiguration.MediaType) ((zak0) su10Var.p).getValue();
                        boolean booleanValue3 = ((Boolean) ((zak0) su10Var.h).getValue()).booleanValue();
                        int i10 = su10.b.$EnumSwitchMapping$1[((su10.a) ((zak0) su10Var.o).getValue()).ordinal()];
                        if (i10 == 1) {
                            multiSelectMode = MediaPickerConfiguration.MultiSelectMode.Single.c;
                        } else if (i10 == 2) {
                            multiSelectMode = new MediaPickerConfiguration.MultiSelectMode.Check(5);
                        } else {
                            if (i10 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            multiSelectMode = new MediaPickerConfiguration.MultiSelectMode.Counter(0, 1, null);
                        }
                        r1.b(r11, d, new MediaPickerFragmentArguments(booleanValue2, booleanValue, cellAspectRation2, new MediaPickerFragmentArguments.MediaFilterPresets(10000L, 20000L, null, null, 12, null), new MediaPickerConfiguration(booleanValue3, multiSelectMode, mediaType)));
                    }
                }
                return s3q0.a;
            case 20:
                ((vm30.p) obj3).invoke();
                ym30 ym30Var = ((vm30) obj2).t0;
                if (ym30Var != null) {
                    ym30Var.a0();
                }
                return s3q0.a;
            case 21:
                izs izsVar3 = (izs) obj2;
                if (obj3 instanceof StoryEntry) {
                    izsVar3.invoke(obj3);
                } else if (obj3 instanceof List) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj4 : (Iterable) obj3) {
                        if (obj4 instanceof StoryEntry) {
                            arrayList.add(obj4);
                        }
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        izsVar3.invoke(it2.next());
                    }
                }
                return s3q0.a;
            case 22:
                FragmentActivity fragmentActivity = ((ao70) obj2).d;
                lxp lxpVar = new lxp((VkAuthState) obj3, fragmentActivity);
                Drawable e2 = enj.e(R.drawable.vk_icon_error_outline_56, R.attr.vk_ui_icon_negative, fragmentActivity);
                Drawable e3 = enj.e(R.drawable.vk_icon_cancel_20, R.attr.vk_ui_icon_secondary, fragmentActivity);
                kcu0 kcu0Var = new kcu0(SchemeStatSak$EventScreen.ALERT_AUTH_PHONE, false, null);
                lxpVar.e.y0(lxpVar);
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                dw20.b bVar = new dw20.b(fragmentActivity, kcu0Var);
                cbq.a(bVar);
                ref$ObjectRef.element = ((dw20.b) dw20.a.R(((dw20.b) bVar.N(e2).F(e3, null)).b0(new gmj(ref$ObjectRef, i4)).v0(R.string.vk_auth_id_already_bound_to_another_account_modal_title).M0(), fragmentActivity.getString(R.string.vk_auth_id_already_bound_to_another_account_modal_subtitle), 0, 0, 6)).h0(R.string.vk_auth_id_already_bound_to_another_account_positive_button_text, new mag(lxpVar, 19)).T(R.string.vk_auth_id_already_bound_to_another_account_negative_button_text, new dgm(lxpVar, 4)).I0("EsiaAlreadyBoundModal");
                return s3q0.a;
            case 23:
                ((izs) obj3).invoke(new sx40.y(((dz40.o) obj2).m()));
                return s3q0.a;
            case 24:
                StringBuilder sb = new StringBuilder("getMarkerBoundingBox fail! ");
                sb.append((Object) StringId.a((String) obj3));
                sb.append(' ');
                do00 do00Var = (do00) ((Ref$ObjectRef) obj2).element;
                sb.append((do00Var == null || (hah0Var = do00Var.e) == null) ? null : Double.valueOf(hah0Var.a(1)));
                return sb.toString();
            case 25:
                com.vk.reefton.trackers.j jVar = (com.vk.reefton.trackers.j) obj3;
                vof0 vof0Var = (vof0) obj2;
                Long l = jVar.l;
                if (l != null) {
                    long currentTimeMillis = System.currentTimeMillis() - l.longValue();
                    uya0 uya0Var = jVar.e;
                    jVar.e = uya0.a(uya0Var, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, uya0Var.q + currentTimeMillis, currentTimeMillis, null, 327679);
                }
                uya0 uya0Var2 = jVar.e;
                int i11 = jVar.g + 1;
                jVar.g = i11;
                vof0Var.a(uya0.a(uya0Var2, null, false, null, null, null, null, null, null, null, null, null, null, null, Integer.valueOf(i11), null, false, 0L, 0L, null, 516095));
                bwa0 bwa0Var = jVar.c;
                if (bwa0Var != null) {
                    vof0Var.a(new bwa0(bwa0Var.a, bwa0Var.b));
                }
                jVar.c = null;
                jVar.e = uya0.a(jVar.e, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 0L, 0L, null, 393215);
                jVar.l = Long.valueOf(System.currentTimeMillis());
                return s3q0.a;
            case 26:
                ((izs) obj3).invoke(new i8o0(((f.a) obj2).a));
                return s3q0.a;
            case 27:
                b3q0 b3q0Var = (b3q0) obj3;
                b3q0Var.d = b3q0.b.HIDE_ENABLED;
                b3q0Var.b((b3q0.a) obj2);
                return s3q0.a;
            case 28:
                CommunityProfileContent communityProfileContent = (CommunityProfileContent) obj2;
                nqq0 nqq0Var = ((com.vk.profile.user.impl.ui.i) obj3).o;
                ListDataSet<UserProfileAdapterItem> listDataSet = nqq0Var.a;
                opq0 opq0Var = nqq0Var.b;
                ListDataSet.ArrayListImpl<UserProfileAdapterItem> arrayListImpl = listDataSet.d;
                ArrayList arrayList2 = new ArrayList();
                Iterator it3 = arrayListImpl.iterator();
                while (it3.hasNext()) {
                    Object next = it3.next();
                    if (!(((UserProfileAdapterItem) next) instanceof UserProfileAdapterItem.t)) {
                        arrayList2.add(next);
                    }
                }
                ArrayList arrayList3 = new ArrayList(arrayList2);
                if (communityProfileContent != null) {
                    UserProfileFragment userProfileFragment = opq0Var.a;
                    loq0 loq0Var = nqq0Var.c;
                    if (!communityProfileContent.b.isEmpty()) {
                        oqq0 oqq0Var = new oqq0(nqq0Var);
                        pqq0 pqq0Var = new pqq0(nqq0Var);
                        dhq0 dhq0Var = new dhq0(communityProfileContent, opq0Var, oqq0Var, new qqq0(nqq0Var), ((s530) loq0Var.f.getValue()).b(userProfileFragment.requireContext(), userProfileFragment, false), communityProfileContent.b() ? (f8d) loq0Var.n.getValue() : null, ((ClipEditComponent) loq0Var.a.getValue()).d6(), new s2b(nqq0Var, userProfileFragment.requireContext(), communityProfileContent, i5), (NewsFeedComponent) loq0Var.l.getValue(), ((b25) loq0Var.j.getValue()).a(communityProfileContent.a), new mdm0(nqq0Var, i4));
                        vt5 vt5Var = new vt5(userProfileFragment);
                        io.reactivex.rxjava3.core.q<ajh> qVar = nqq0Var.f;
                        h7v h7vVar = (h7v) loq0Var.o.getValue();
                        int i12 = y1z.a;
                        LegoCustomRedesignedScreen legoCustomRedesignedScreen = LegoCustomRedesignedScreen.EXAMPLE;
                        wih wihVar = new wih(communityProfileContent, dhq0Var, vt5Var, oqq0Var, pqq0Var, qVar, h7vVar, null, null, Tensorflow.FRAME_HEIGHT);
                        wihVar.a = 2;
                        eVar = new UserProfileAdapterItem.b(wihVar);
                    } else if (communityProfileContent.h) {
                        boh bohVar = new boh(2);
                        bohVar.a = 2;
                        eVar = new UserProfileAdapterItem.e(bohVar);
                    } else {
                        eVar = null;
                    }
                    if (eVar != null) {
                        arrayList3.add(eVar);
                        listDataSet.setItems(arrayList3);
                        CommunityProfileContent.InitialPosition initialPosition = communityProfileContent.g;
                        CommunityProfileContent.InitialPosition.ScrollToContentType scrollToContentType = initialPosition != null ? initialPosition.b : null;
                        int i13 = scrollToContentType == null ? -1 : nqq0.a.$EnumSwitchMapping$0[scrollToContentType.ordinal()];
                        f.d.b bVar2 = i13 != 1 ? i13 != 2 ? null : new f.d.b(listDataSet.v(eVar), true) : new f.d.b(listDataSet.v(eVar), false);
                        if (bVar2 != null) {
                            nqq0Var.e.B(bVar2);
                        }
                    }
                }
                return s3q0.a;
            default:
                bbp bbpVar = (bbp) obj3;
                View[] viewArr = (View[]) obj2;
                for (View view4 : (View[]) Arrays.copyOf(viewArr, viewArr.length)) {
                    ViewGroup.LayoutParams layoutParams = view4.getLayoutParams();
                    layoutParams.height = bbpVar.getMeasuredHeight();
                    layoutParams.width = bbpVar.getMeasuredWidth();
                    view4.requestLayout();
                }
                bbpVar.addOnLayoutChangeListener(new byt0(new yq1(23, bbpVar, viewArr)));
                return s3q0.a;
        }
    }

    public /* synthetic */ n0(vm30.p pVar, vm30 vm30Var, Msg msg) {
        this.b = 20;
        this.c = pVar;
        this.d = vm30Var;
    }
}
