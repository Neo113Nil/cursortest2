package xsna;

import android.content.Context;
import android.content.res.Configuration;
import android.util.Size;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.generated.auth.dto.AuthGetWebAuthLinkResponseDto;
import com.vk.attachpicker.impl.fragment.video.AttachVideoFragment;
import com.vk.clips.clipsaudio.views.ClipsAudioFragment;
import com.vk.clips.design.view.templates.ClipsTemplateEditorFragmentsBottomView;
import com.vk.clips.entrypoints.ui.ClipsEntryPointDraftsFragment;
import com.vk.clips.favorites.impl.ui.folders.list.c;
import com.vk.clips.favorites.impl.ui.folders.picker.ClipsFavoritesFoldersPickerFragment;
import com.vk.clips.uploader.api.model.ClipUploadJob;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.common.links.LaunchContext;
import com.vk.dto.newsfeed.activities.Activity;
import com.vk.dto.newsfeed.activities.LikesActivity;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.ecomm.catalog.impl.catalog.simple.ClassifiedsCatalogSimpleRootVh;
import com.vk.ecomm.design.view.tile.MarketProductTileConfig;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import one.video.player.OneVideoPlayer;
import xsna.d4e;
import xsna.ded;
import xsna.ikv0;
import xsna.pw3;
import xsna.r5;
import xsna.tj50;
import xsna.wzd;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class j5 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j5(ClipsAudioFragment clipsAudioFragment, ClipsAudioFragment.b bVar) {
        this.b = 20;
        this.c = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v110, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.util.AttributeSet, android.util.Size, java.lang.String, xsna.ikv0$d$a] */
    /* JADX WARN: Type inference failed for: r7v1, types: [xsna.wm60] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v23 */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        qtc0 qtc0Var;
        Activity activity;
        boolean z;
        ife e;
        int i = 6;
        int i2 = 10;
        int i3 = 8;
        r5 = false;
        boolean z2 = false;
        int i4 = 1;
        ?? r7 = 0;
        r7 = 0;
        r7 = 0;
        r7 = 0;
        r7 = 0;
        r7 = 0;
        switch (this.b) {
            case 0:
                ((r5.a) this.c).m.setItems((List) obj);
                break;
            case 1:
                yn0 yn0Var = (yn0) this.c;
                yn0Var.r.invoke((tco0) obj, ovi.a(yn0Var, AndroidCompositionLocals_androidKt.b));
                break;
            case 2:
                yp80 yp80Var = (yp80) this.c;
                Throwable th = (Throwable) obj;
                if (yp80Var != null) {
                    yp80Var.onError(th);
                }
                break;
            case 3:
                xc3 xc3Var = (xc3) this.c;
                NewsEntry newsEntry = (NewsEntry) obj;
                if (((Boolean) xc3Var.h.getValue()).booleanValue() && (qtc0Var = xc3Var.b) != null && (activity = (Activity) qtc0Var.a.get(new Pair(Long.valueOf(k9q0.o(newsEntry).b), Integer.valueOf(di60.n(newsEntry))))) != null && (newsEntry instanceof Post) && (activity instanceof LikesActivity)) {
                    LikesActivity likesActivity = (LikesActivity) activity;
                    if (likesActivity.f == LikesActivity.Position.DEFAULT) {
                        r7 = new o3c0((Post) newsEntry, likesActivity);
                    }
                }
                break;
            case 4:
                ow3 ow3Var = (ow3) this.c;
                pw3.b bVar = new pw3.b((String) obj);
                if (ow3Var.j) {
                    ow3Var.g.onNext(bVar);
                }
                break;
            case 5:
                AttachVideoFragment attachVideoFragment = (AttachVideoFragment) this.c;
                int i5 = AttachVideoFragment.F0;
                attachVideoFragment.wo(new igq0(null));
                break;
            case 6:
                Boolean bool = (Boolean) obj;
                rr4 rr4Var = ((jr4) this.c).s;
                if (rr4Var != null) {
                    rr4Var.b(bool.booleanValue());
                }
                break;
            case 7:
                com.vk.content.design.view.camera.a aVar = (com.vk.content.design.view.camera.a) this.c;
                Integer num = (Integer) obj;
                if (num.intValue() > 0) {
                    di10 di10Var = aVar.e;
                    if (di10Var != null) {
                        di10Var.setNewMasksBadgeCount(xpm0.a(num.intValue()));
                    }
                    di10 di10Var2 = aVar.e;
                    if (di10Var2 != null) {
                        di10Var2.w(Boolean.TRUE);
                    }
                } else {
                    di10 di10Var3 = aVar.e;
                    if (di10Var3 != null) {
                        di10Var3.w(Boolean.FALSE);
                    }
                }
                break;
            case 8:
                maz.c(xwk.d().e(), (Context) this.c, ((AuthGetWebAuthLinkResponseDto) obj).getUrl(), LaunchContext.A, null, null, 24);
                break;
            case 9:
                break;
            case 10:
                nq40 nq40Var = ((laa) this.c).q;
                nq40Var.getClass();
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                za80 za80Var = (za80) obj;
                DialogExt dialogExt = ((ymb) this.c).i;
                if (dialogExt != null && za80Var.b == dialogExt.e) {
                    z2 = true;
                }
                break;
            case 14:
                ajp0 ajp0Var = (ajp0) obj;
                ((a8c) this.c).getClass();
                if (ajp0Var.c.h()) {
                    a8c.g(ajp0Var, ajp0Var.c);
                }
                break;
            case 15:
                break;
            case 16:
                ClassifiedsCatalogSimpleRootVh classifiedsCatalogSimpleRootVh = (ClassifiedsCatalogSimpleRootVh) this.c;
                classifiedsCatalogSimpleRootVh.z.d();
                android.app.Activity activity2 = classifiedsCatalogSimpleRootVh.b;
                ikv0.a aVar2 = new ikv0.a(activity2);
                aVar2.t = new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_on_24, Integer.valueOf(activity2.getColor(R.color.vk_azure_A400)), (Size) r7, 12);
                aVar2.u = new ikv0.d(activity2.getString(R.string.community_market_album_edited), (String) r7, (ikv0.d.a) r7, i);
                aVar2.n();
                break;
            case 17:
                ((w6d) this.c).e.a(x5d.b);
                break;
            case 18:
                c9d c9dVar = (c9d) this.c;
                if (((OneVideoPlayer) obj).getState() == OneVideoPlayer.State.PLAYING) {
                    c9dVar.d(true);
                } else {
                    c9dVar.u();
                }
                break;
            case 19:
                MarketProductTileConfig marketProductTileConfig = (MarketProductTileConfig) obj;
                sid0 sid0Var = ((bbd) this.c).e;
                if (sid0Var != null) {
                    sid0Var.invoke(marketProductTileConfig);
                }
                break;
            case 20:
                ClipsAudioFragment.b bVar2 = (ClipsAudioFragment.b) this.c;
                int intValue = ((Integer) obj).intValue();
                int i6 = ClipsAudioFragment.Y;
                bVar2.d.s(intValue);
                break;
            case 21:
                rxd rxdVar = (rxd) this.c;
                io.reactivex.rxjava3.subjects.a<Boolean> aVar3 = rxdVar.d;
                List list = (List) obj;
                if (!list.isEmpty()) {
                    szd szdVar = rxdVar.a.b;
                    List<? extends wzd> singletonList = Collections.singletonList(new wzd.b(null));
                    List<List> list2 = list;
                    ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                    for (List list3 : list2) {
                        ArrayList arrayList2 = new ArrayList(c5g.u(list3, 10));
                        Iterator it = list3.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(new com.vk.clips.editor.state.model.b((nov) it.next()));
                        }
                        arrayList.add(arrayList2);
                    }
                    com.vk.clips.editor.state.model.a aVar4 = szdVar.o.a;
                    szdVar.c(com.vk.clips.editor.state.model.a.c(aVar4, null, null, null, null, j5g.u0(arrayList, aVar4.f), null, 95), singletonList);
                }
                aVar3.onNext(Boolean.TRUE);
                aVar3.onComplete();
                break;
            case 22:
                lzd lzdVar = (lzd) this.c;
                lyd.a.a("ClipsEditorProcessingDelegateImpl", (Throwable) obj);
                lzdVar.d.i().a(true);
                lzdVar.b.p();
                break;
            case 23:
                ClipsEntryPointDraftsFragment clipsEntryPointDraftsFragment = (ClipsEntryPointDraftsFragment) this.c;
                List list4 = (List) obj;
                RecyclerView recyclerView = clipsEntryPointDraftsFragment.S;
                ((wco) (recyclerView != null ? recyclerView : null).getAdapter()).submitList(list4);
                clipsEntryPointDraftsFragment.onConfigurationChanged(new Configuration());
                break;
            case 24:
                ((com.vk.clips.favorites.impl.ui.folders.list.b) this.c).T(new c.a(((d4e.a.d) obj).a));
                break;
            case 25:
                ClipsFavoritesFoldersPickerFragment clipsFavoritesFoldersPickerFragment = (ClipsFavoritesFoldersPickerFragment) this.c;
                ClipsFavoritesFoldersPickerFragment.a aVar5 = ClipsFavoritesFoldersPickerFragment.V;
                clipsFavoritesFoldersPickerFragment.dismiss();
                break;
            case 26:
                xde xdeVar = (xde) this.c;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : (List) obj) {
                    Pair pair = (Pair) obj2;
                    int i7 = emf.a;
                    Integer num2 = ((ClipUploadJob) pair.i()).f;
                    boolean z3 = (num2 != null ? num2.intValue() : 0) > 0;
                    if (!(pair.j() instanceof ded.g)) {
                        boolean z4 = z3;
                        if (!xdeVar.b) {
                            z4 = !z3;
                        }
                        if (z4) {
                            z = true;
                            if (!z) {
                                arrayList3.add(obj2);
                            }
                        }
                    }
                    z = false;
                    if (!z) {
                    }
                }
                ArrayList arrayList4 = new ArrayList(c5g.u(arrayList3, 10));
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    Pair pair2 = (Pair) it2.next();
                    ClipUploadJob clipUploadJob = (ClipUploadJob) pair2.i();
                    arrayList4.add(new uee(emf.b(clipUploadJob), xlf.a(clipUploadJob, (ded) pair2.j()), null));
                }
                Iterator it3 = xdeVar.f.values().iterator();
                while (it3.hasNext()) {
                    ((eoe) it3.next()).h.onNext(arrayList4);
                }
                break;
            case 27:
                tj50.a aVar6 = (tj50.a) obj;
                xre xreVar = (xre) ((sre) this.c).d.getValue();
                xreVar.getClass();
                io3 io3Var = new io3(i3);
                ao8 ao8Var = ao8.d;
                break;
            case 28:
                ClipsTemplateEditorFragmentsBottomView clipsTemplateEditorFragmentsBottomView = (ClipsTemplateEditorFragmentsBottomView) this.c;
                int intValue2 = ((Integer) obj).intValue();
                ClipsTemplateEditorFragmentsBottomView.a aVar7 = clipsTemplateEditorFragmentsBottomView.b;
                if (aVar7 != null) {
                    aVar7.a(intValue2);
                }
                break;
            default:
                ClipsWrapperFragment clipsWrapperFragment = (ClipsWrapperFragment) this.c;
                otf otfVar = (otf) obj;
                xuf xufVar = clipsWrapperFragment.G0;
                if (xufVar != null && (e = xufVar.e()) != null) {
                    e.post(new x9b(clipsWrapperFragment, e, otfVar, i4));
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ j5(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }
}
