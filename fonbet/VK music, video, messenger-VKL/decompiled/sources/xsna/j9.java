package xsna;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.Size;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.appset.AppSetIdInfo;
import com.unity3d.ads.core.data.datasource.AndroidAppSetIdDataSource;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.groups.dto.GroupsCollectionItemDto;
import com.vk.bridges.ImageViewer;
import com.vk.catalog2.common.ui.mvp.holder.group.topbar.CommunitiesSearchTopBarVh;
import com.vk.clips.playlists.ui.picker.c;
import com.vk.clips.sdk.shared.item.ads.AdsItemPatch;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.dto.common.Image;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.GroupCollection;
import com.vk.dto.photo.Photo;
import com.vk.libvideo.bottomsheet.about.delegate.t;
import com.vk.photos.root.archive.presentation.ArchiveFragment;
import com.vk.photos.ui.base.BasePhotoListFragment;
import com.vk.stat.scheme.SchemeStat$PostDraftItemEventType;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import ru.mail.verify.core.api.ApplicationModule;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.tracer.lite.TracerLite;
import xsna.ai8;
import xsna.aie;
import xsna.b4;
import xsna.c0x0;
import xsna.ca9;
import xsna.cwb0;
import xsna.ew6;
import xsna.ikv0;
import xsna.kr5;
import xsna.tj50;
import xsna.uu;
import xsna.uuf;
import xsna.wk50;
import xsna.xf8;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class j9 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j9(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.util.Size, java.lang.String, xsna.ikv0$d$a] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v8, types: [xsna.ai8$a] */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r5v28, types: [java.util.ArrayList] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        s3q0 invoke$lambda$1;
        s3q0 a;
        ImageViewer.c<Photo> g;
        Image image;
        Image image2;
        ?? r5;
        Fragment fragment;
        Context context;
        Dialog dialog;
        FragmentManager supportFragmentManager;
        List<Fragment> f;
        int i = this.b;
        Image image3 = null;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((t.a) obj2).m.d(b4.d0.a);
                return s3q0.a;
            case 1:
                invoke$lambda$1 = AndroidAppSetIdDataSource.invoke$lambda$1((AndroidAppSetIdDataSource) obj2, (AppSetIdInfo) obj);
                return invoke$lambda$1;
            case 2:
                a = ApplicationModule.a((ru.mail.libverify.u.w) obj2, (TracerLite.Configuration.Builder) obj);
                return a;
            case 3:
                int intValue = ((Integer) obj).intValue();
                int i2 = ArchiveFragment.e0;
                RecyclerView.e0 findViewHolderForAdapterPosition = ((nj3) obj2).h.getRecyclerView().findViewHolderForAdapterPosition(intValue);
                if (findViewHolderForAdapterPosition != null) {
                    return findViewHolderForAdapterPosition.itemView;
                }
                return null;
            case 4:
                String str = (String) obj;
                EditText editText = (EditText) ((ow3) obj2).e.getValue();
                boolean isFocused = editText.isFocused();
                boolean f2 = epx.f(str, editText.getText().toString());
                if (!isFocused && !f2) {
                    int max = Math.max(0, Math.min(editText.getSelectionStart(), str.length() - 1));
                    int max2 = Math.max(0, Math.min(editText.getSelectionEnd(), str.length() - 1));
                    editText.setText(str);
                    editText.setSelection(max, max2);
                }
                return s3q0.a;
            case 5:
                kr5.a aVar = (kr5.a) obj2;
                int intValue2 = ((Integer) obj).intValue();
                String str2 = aVar.b;
                if (str2 != null) {
                    return str2;
                }
                pjw pjwVar = aVar.a;
                if (pjwVar != null) {
                    return pjwVar.f(intValue2);
                }
                return null;
            case 6:
                qdu.a((oio) obj, (mdu) obj2);
                return s3q0.a;
            case 7:
                com.vk.content.design.view.camera.a aVar2 = (com.vk.content.design.view.camera.a) obj2;
                if (((Boolean) obj).booleanValue()) {
                    com.vk.content.design.view.camera.a.o(aVar2);
                }
                return s3q0.a;
            case 8:
                BasePhotoListFragment basePhotoListFragment = (BasePhotoListFragment) obj2;
                Photo photo = (Photo) obj;
                int i3 = BasePhotoListFragment.m0;
                fj6 io2 = basePhotoListFragment.io();
                if (io2 == null || !io2.Q6()) {
                    int indexOf = ((ArrayList) basePhotoListFragment.po().y0()).indexOf(photo);
                    if (indexOf >= 0) {
                        g = myc0.d().g(indexOf, basePhotoListFragment.po().y0(), basePhotoListFragment.kn(), basePhotoListFragment.l0, o25.a().c());
                        basePhotoListFragment.c0 = g;
                    }
                } else {
                    basePhotoListFragment.oo(photo);
                }
                return s3q0.a;
            case 9:
                us6 us6Var = (us6) obj2;
                int i4 = us6.p1;
                if (!(((c0x0) obj) instanceof c0x0.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                us6Var.hide();
                return s3q0.a;
            case 10:
                fw6 fw6Var = (fw6) obj2;
                if (epx.f((ew6) obj, ew6.a.a)) {
                    fw6Var.a();
                }
                return s3q0.a;
            case 11:
                ((mx6) obj2).c.i();
                return s3q0.a;
            case 12:
                ((wk50.a) obj2).b(new AdsItemPatch.a.b(new uu.a((Bitmap) obj)));
                return s3q0.a;
            case 13:
                ((wf8) obj2).d(xf8.a.a);
                return s3q0.a;
            case 14:
                yh8 yh8Var = (yh8) obj2;
                bzb0 bzb0Var = yh8Var.o;
                ai8 ai8Var = yh8Var.q;
                r4 = ai8Var instanceof ai8.a ? (ai8.a) ai8Var : 0;
                boolean z = r4 != 0 && r4.d;
                bzb0.d(bzb0Var, new cwb0.a1(z ? R.string.voip_broadcast_record_finish_submit_dialog_title : R.string.voip_broadcast_stream_finish_submit_dialog_title, null, z ? R.string.voip_broadcast_record_finish_submit_description : R.string.voip_broadcast_finish_submit_description, null, R.string.voip_broadcast_finish_submit_yes, null, R.string.voip_broadcast_finish_submit_no, null, null, null, 938), new com.vk.newsfeed.posting.mediapicker.photovk.base.a(yh8Var, 13), null, null, 28);
                return s3q0.a;
            case 15:
                m99 m99Var = (m99) obj2;
                Set set = (Set) obj;
                ca9 ca9Var = m99Var.j().c;
                if (ca9Var instanceof ca9.c) {
                    m99Var.f(s99.a(m99Var.j(), null, null, ca9.c.a((ca9.c) ca9Var, null, null, null, null, set, null, null, null, null, null, false, null, null, null, null, false, null, false, null, false, null, -65537, ApiInvocationException.ErrorCodes.IDS_BLOCKED), null, null, null, null, false, 251));
                }
                return s3q0.a;
            case 16:
                ((u440) ((sg9) obj2).c).a((io.reactivex.rxjava3.disposables.c) obj);
                return s3q0.a;
            case 17:
                lh9.d(((nj9) obj2).d, (Bitmap) obj);
                return s3q0.a;
            case 18:
                GroupsCollectionItemDto groupsCollectionItemDto = (GroupsCollectionItemDto) obj;
                int size = ((List) obj2).size();
                String id = groupsCollectionItemDto.getId();
                String str3 = id == null ? "" : id;
                String k = groupsCollectionItemDto.k();
                String str4 = k == null ? "" : k;
                String description = groupsCollectionItemDto.getDescription();
                String str5 = description == null ? "" : description;
                String l = groupsCollectionItemDto.l();
                String str6 = l == null ? "" : l;
                String url = groupsCollectionItemDto.getUrl();
                String str7 = url == null ? "" : url;
                List<BaseImageDto> f3 = groupsCollectionItemDto.f();
                if (f3 != null) {
                    new ne6();
                    image = ne6.a(f3);
                } else {
                    image = null;
                }
                List<BaseImageDto> i5 = groupsCollectionItemDto.i();
                if (i5 != null) {
                    new ne6();
                    image2 = ne6.a(i5);
                } else {
                    image2 = null;
                }
                List<UserId> e = groupsCollectionItemDto.e();
                if (e != null) {
                    List<UserId> list = e;
                    r5 = new ArrayList(c5g.u(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        r5.add(Long.valueOf(((UserId) it.next()).b));
                    }
                } else {
                    r5 = 0;
                }
                if (r5 == 0) {
                    r5 = EmptyList.b;
                }
                List list2 = r5;
                String j = groupsCollectionItemDto.j();
                String str8 = j == null ? "" : j;
                Integer d = groupsCollectionItemDto.d();
                int intValue3 = d != null ? d.intValue() : -1;
                List<BaseImageDto> g2 = groupsCollectionItemDto.g();
                if (g2 != null) {
                    new ne6();
                    image3 = ne6.a(g2);
                }
                return new GroupCollection(str3, str4, str5, str6, str7, image, image2, list2, str8, size, intValue3, image3);
            case 19:
                int i6 = q7b.l1;
                ((q7b) obj2).getFeature().C((n7b) obj);
                return s3q0.a;
            case 20:
                rkb rkbVar = (rkb) obj2;
                rkbVar.h.onNext(rkbVar.a((sfb) obj, rkbVar.b()));
                return s3q0.a;
            case 21:
                ((ftb) obj2).e.k0();
                return s3q0.a;
            case 22:
                ttb ttbVar = ((rtb) obj2).m;
                (ttbVar != null ? ttbVar : null).c();
                return s3q0.a;
            case 23:
                ((zwb) obj2).I0((io.reactivex.rxjava3.disposables.c) obj);
                return s3q0.a;
            case 24:
                aie aieVar = (aie) obj2;
                if (((aie.b) obj) == aie.b.SHOW) {
                    c63 c63Var = c63.a;
                    Activity b = c63.b();
                    FragmentActivity fragmentActivity = b instanceof FragmentActivity ? (FragmentActivity) b : null;
                    if (fragmentActivity == null || (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) == null || (f = supportFragmentManager.c.f()) == null) {
                        fragment = null;
                    } else {
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : f) {
                            Fragment fragment2 = (Fragment) obj3;
                            if (fragment2.isVisible() || ((fragment2 instanceof androidx.fragment.app.d) && ((androidx.fragment.app.d) fragment2).o)) {
                                arrayList.add(obj3);
                            }
                        }
                        fragment = (Fragment) j5g.k0(arrayList);
                    }
                    androidx.fragment.app.d dVar = fragment instanceof androidx.fragment.app.d ? (androidx.fragment.app.d) fragment : null;
                    Window window = (dVar == null || (dialog = dVar.s) == null) ? null : dialog.getWindow();
                    WeakReference<Context> weakReference = aieVar.d;
                    if (weakReference != null && (context = weakReference.get()) != null) {
                        ikv0.a aVar3 = new ikv0.a(bwt0.u(context));
                        aVar3.t = new ikv0.c.C3058c(R.drawable.vk_icon_animated_check_circle_on_24, Integer.valueOf(R.attr.vk_ui_icon_accent), (Size) r4, 12);
                        aVar3.u = new ikv0.d(context.getString(R.string.clip_interests_success), (String) r4, (ikv0.d.a) r4, 6);
                        aVar3.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, context.getString(R.string.clip_interests_success_button_text), new vr0(14));
                        aVar3.e = 4000L;
                        aVar3.d = true;
                        if (window != null) {
                            aVar3.p(window);
                        } else {
                            aVar3.n();
                        }
                    }
                }
                return s3q0.a;
            case 25:
                ((com.vk.clips.playlists.ui.picker.b) obj2).T(new c.a(false));
                return s3q0.a;
            case 26:
                int i7 = ClipsWrapperFragment.Q0;
                ((etv0) obj).b(false);
                ((View) obj2).performClick();
                return s3q0.a;
            case 27:
                tj50.a aVar4 = (tj50.a) obj;
                vuf vufVar = ((itf) obj2).e;
                dtf dtfVar = new dtf(1, vufVar, vuf.class, "mapNavigationButton", "mapNavigationButton(Lcom/vk/clips/viewer/impl/feed/wrapper/presentation/state/ClipsWrapperMviState;)Lcom/vk/clips/viewer/impl/feed/wrapper/ui/state/ClipsWrapperViewState$NavigationButtonData;", 0);
                ao8 ao8Var = ao8.d;
                return new uuf.a(aVar4.a(dtfVar, ao8Var), aVar4.a(new etf(1, vufVar, vuf.class, "mapExtraButtons", "mapExtraButtons(Lcom/vk/clips/viewer/impl/feed/wrapper/presentation/state/ClipsWrapperMviState;)Lcom/vk/clips/viewer/impl/feed/wrapper/ui/state/ClipsWrapperViewState$ExtraButtonsData;", 0), ao8Var), aVar4.a(new ftf(1, vufVar, vuf.class, "mapSearchButton", "mapSearchButton(Lcom/vk/clips/viewer/impl/feed/wrapper/presentation/state/ClipsWrapperMviState;)Lcom/vk/clips/viewer/impl/feed/wrapper/ui/state/ClipsWrapperViewState$ExtraButtonData$SearchButtonData;", 0), ao8Var), aVar4.a(new gtf(1, vufVar, vuf.class, "mapCreateButton", "mapCreateButton(Lcom/vk/clips/viewer/impl/feed/wrapper/presentation/state/ClipsWrapperMviState;)Lcom/vk/clips/viewer/impl/feed/wrapper/ui/state/ClipsWrapperViewState$ExtraButtonData$CreateButtonData;", 0), ao8Var), aVar4.a(new htf(1, vufVar, vuf.class, "mapMoreButton", "mapMoreButton(Lcom/vk/clips/viewer/impl/feed/wrapper/presentation/state/ClipsWrapperMviState;)Lcom/vk/clips/viewer/impl/feed/wrapper/ui/state/ClipsWrapperViewState$ExtraButtonData$MoreButtonData;", 0), ao8Var));
            case 28:
                CommunitiesSearchTopBarVh communitiesSearchTopBarVh = (CommunitiesSearchTopBarVh) obj2;
                tho0 tho0Var = (tho0) obj;
                wh50 wh50Var = communitiesSearchTopBarVh.g;
                String str9 = ((tho0) ((zak0) wh50Var).getValue()).a.c;
                us2 us2Var = tho0Var.a;
                if (!epx.f(str9, us2Var.c)) {
                    communitiesSearchTopBarVh.f.onNext(us2Var.c);
                }
                ((zak0) wh50Var).setValue(tho0Var);
                return s3q0.a;
            default:
                xch xchVar = (xch) obj2;
                Date date = (Date) obj;
                xchVar.d.e1(date);
                xchVar.c.d(date.getTime(), xchVar.f);
                jbc0 jbc0Var = xchVar.b;
                SchemeStat$PostDraftItemEventType schemeStat$PostDraftItemEventType = SchemeStat$PostDraftItemEventType.POST_NOW;
                jbc0Var.g();
                return s3q0.a;
        }
    }

    public /* synthetic */ j9(his0 his0Var, List list) {
        this.b = 18;
        this.c = list;
    }
}
