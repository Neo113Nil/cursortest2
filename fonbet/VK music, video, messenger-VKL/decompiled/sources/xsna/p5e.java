package xsna;

import android.content.Context;
import android.view.Window;
import android.widget.Toast;
import com.vk.api.generated.shortVideo.dto.ShortVideoPlaylistFullDto;
import com.vk.auth.main.AuthModel;
import com.vk.camera.editor.stories.api.base.privacy.StoryPrivacyType;
import com.vk.common.links.LaunchContext;
import com.vk.dto.newsfeed.FaveTag;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.clickable.ClickableStickers;
import com.vk.ecomm.verifiedseller.impl.screens.obtainverification.ObtainVerificationFragment;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.ui.components.msg_list.b;
import com.vk.log.L;
import com.vk.stories.design.view.stats.carousel.PreviewSnapRecyclerView;
import com.vk.stories.design.view.stats.tabs.StoryStatisticsTab;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.bhm0;
import xsna.ikv0;
import xsna.pl30;
import xsna.tlo0;
import xsna.ur70;
import xsna.w8v;
import xsna.xn50;

/* compiled from: ClipsFavoritesRepository.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class p5e extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p5e(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        androidx.fragment.app.d dVar;
        Window window;
        String obj2;
        List list;
        PreviewSnapRecyclerView previewRecycler;
        int i = 6;
        int i2 = 1;
        switch (this.b) {
            case 0:
                ((c4e) this.receiver).getClass();
                return c4e.a((ShortVideoPlaylistFullDto) obj);
            case 1:
                ((com.vk.profile.community.impl.ui.profile.a) this.receiver).Y((com.vk.profile.community.impl.ui.profile.actions.d) obj);
                return s3q0.a;
            case 2:
                FaveTag faveTag = (FaveTag) obj;
                fqq fqqVar = (fqq) this.receiver;
                int i3 = fqq.h;
                WeakReference<androidx.fragment.app.d> dialogHolder = fqqVar.getDialogHolder();
                if (dialogHolder != null && (dVar = dialogHolder.get()) != null) {
                    dVar.dismiss();
                }
                enq.a.getClass();
                enq.e(faveTag);
                return s3q0.a;
            case 3:
                ((vo20) this.receiver).i.setText(String.valueOf(((Number) obj).intValue()));
                return s3q0.a;
            case 4:
                pl30 pl30Var = (pl30) obj;
                com.vk.im.ui.components.msg_list.c cVar = (com.vk.im.ui.components.msg_list.c) this.receiver;
                cVar.getClass();
                if (pl30Var instanceof pl30.d) {
                    w8v w8vVar = ((pl30.d) pl30Var).a;
                    boolean z = cVar.j;
                    int i4 = 4;
                    io.reactivex.rxjava3.disposables.c h = io.reactivex.rxjava3.kotlin.c.h(new io.reactivex.rxjava3.internal.operators.single.h(new io.reactivex.rxjava3.internal.operators.single.k(new io.reactivex.rxjava3.internal.operators.single.o(new io.reactivex.rxjava3.internal.operators.single.o(new io.reactivex.rxjava3.internal.operators.single.o(new io.reactivex.rxjava3.internal.operators.single.r(new io.reactivex.rxjava3.internal.operators.single.o(new io.reactivex.rxjava3.internal.operators.single.v(new s19(cVar, i2)), new lkz(new kfh(z, cVar, w8vVar), i4)), new yzt(new z5a(18, cVar, w8vVar), i)), new j3z(new ul30(z, cVar), 5)), new w00(new rxz(cVar, i4), 29)), new tl30(new gmj(cVar, 27), null == true ? 1 : 0)).q(cVar.n).m(asu0.a.d()), new zsb(cVar, 2)), new g600(new g22(19, cVar, w8vVar), i4)), new yo20(cVar, 1), null, 2);
                    cVar.l.b(h);
                    cVar.m = h;
                } else if (pl30Var instanceof pl30.a) {
                    cVar.b(new b.f(((pl30.a) pl30Var).a));
                } else if (pl30Var instanceof pl30.e) {
                    pl30.e eVar = (pl30.e) pl30Var;
                    f1e0 f1e0Var = eVar.a;
                    ProfilesInfo profilesInfo = eVar.b;
                    List<com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g> list2 = cVar.g().c;
                    if (list2 != null && !list2.isEmpty()) {
                        cVar.e.k.onNext(new pl30.d(w8v.c.c));
                    }
                    cVar.b(new b.d(profilesInfo, f1e0Var));
                } else if (pl30Var instanceof pl30.b) {
                    Dialog dialog = ((pl30.b) pl30Var).a;
                    cVar.l(true, new ie3(17, cVar, dialog));
                    cVar.b(new b.C1149b(dialog));
                } else {
                    if (!(pl30Var instanceof pl30.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cVar.i(((pl30.c) pl30Var).a);
                }
                return s3q0.a;
            case 5:
                ((com.vk.metrics.eventtracking.b) this.receiver).a((Throwable) obj);
                return s3q0.a;
            case 6:
                ur70 ur70Var = (ur70) obj;
                ObtainVerificationFragment obtainVerificationFragment = (ObtainVerificationFragment) this.receiver;
                qcy<Object>[] qcyVarArr = ObtainVerificationFragment.T;
                if (ur70Var instanceof rr70) {
                    obtainVerificationFragment.kn().onBackPressed();
                } else if (ur70Var instanceof tr70) {
                    ((qdz) obtainVerificationFragment.R.getValue()).getBrowser().f(obtainVerificationFragment.requireContext(), null, LaunchContext.A, ((tr70) ur70Var).a);
                } else if (ur70Var instanceof sr70) {
                    maz.c(((qdz) obtainVerificationFragment.R.getValue()).e(), obtainVerificationFragment.requireContext(), ((sr70) ur70Var).a, LaunchContext.A, null, null, 24);
                } else {
                    if (!(ur70Var instanceof ur70.a)) {
                        obtainVerificationFragment.getClass();
                        throw new NoWhenBranchMatchedException();
                    }
                    Toast.makeText(obtainVerificationFragment.kn(), ((ur70.a) ur70Var).a, 0).show();
                }
                return s3q0.a;
            case 7:
                ycd0 ycd0Var = (ycd0) this.receiver;
                ycd0Var.getClass();
                xn50.a.c(ycd0Var, (zcd0) obj);
                return s3q0.a;
            case 8:
                bhm0 bhm0Var = (bhm0) obj;
                hem0 hem0Var = (hem0) this.receiver;
                int i5 = hem0.y1;
                hem0Var.getClass();
                if (epx.f(bhm0Var, bhm0.a.a)) {
                    hem0Var.hide();
                } else if (epx.f(bhm0Var, bhm0.c.a)) {
                    uov uovVar = hem0Var.u1;
                    if (uovVar != null) {
                        sxc0.a().a(hem0Var.requireContext(), uovVar.getViewEntryPoint());
                    }
                } else if (bhm0Var instanceof bhm0.b) {
                    bhm0.b bVar = (bhm0.b) bhm0Var;
                    StoryPrivacyType storyPrivacyType = bVar.a;
                    int i6 = bVar.b;
                    vfm0 vfm0Var = hem0Var.q1;
                    if (vfm0Var != null) {
                        svk0 svk0Var = new svk0(hem0Var, 8);
                        vfm0Var.a().f(vfm0Var.h);
                        vfm0Var.a().n(new om30(i6, storyPrivacyType, svk0Var, vfm0Var));
                        vfm0Var.a().p(true, true, vfm0Var.b.getContext(), new ikj0(i6, storyPrivacyType, svk0Var, vfm0Var));
                    }
                } else if (bhm0Var instanceof bhm0.d) {
                    int i7 = ((bhm0.d) bhm0Var).a;
                    pfm0 pfm0Var = hem0Var.k1;
                    if (pfm0Var != null && (previewRecycler = pfm0Var.getPreviewRecycler()) != null) {
                        previewRecycler.e = true;
                        previewRecycler.smoothScrollToPosition(i7);
                    }
                } else if (bhm0Var instanceof bhm0.f) {
                    hem0Var.o1 = ((bhm0.f) bhm0Var).a;
                } else if (bhm0Var instanceof bhm0.h) {
                    n7b0 n7b0Var = hem0Var.v1;
                    if (n7b0Var != null) {
                        n7b0Var.invoke(Integer.valueOf(((bhm0.h) bhm0Var).a));
                    }
                } else if (bhm0Var instanceof bhm0.g) {
                    StoryEntry storyEntry = ((bhm0.g) bhm0Var).a;
                    mfm0 mfm0Var = hem0Var.l1;
                    if (mfm0Var != null) {
                        com.vk.stories.design.view.stats.tabs.a aVar = mfm0Var.h;
                        aVar.getClass();
                        ClickableStickers clickableStickers = storyEntry.X;
                        boolean z2 = (clickableStickers != null && ((Boolean) clickableStickers.h.getValue()).booleanValue()) || storyEntry.Y > 0;
                        if (aVar.m != z2) {
                            aVar.m = z2;
                            if (z2) {
                                aVar.notifyItemInserted(StoryStatisticsTab.STICKERS.m());
                            } else {
                                aVar.notifyItemRemoved(StoryStatisticsTab.STICKERS.m());
                            }
                        }
                        StoryStatisticsTab.Companion.getClass();
                        list = StoryStatisticsTab.ALL_POSITIONS;
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ihm0 b = mfm0Var.b(((Number) it.next()).intValue());
                            if (b != null) {
                                b.K8(storyEntry);
                            }
                        }
                        mfm0.a(mfm0Var.f);
                    }
                } else {
                    if (!(bhm0Var instanceof bhm0.e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    tlo0.f fVar = ((bhm0.e) bhm0Var).a;
                    android.app.Dialog dialog2 = hem0Var.s;
                    if (dialog2 != null && (window = dialog2.getWindow()) != null) {
                        Context bo = hem0Var.bo();
                        fVar.getClass();
                        CharSequence a = tlo0.b.a(fVar, bo);
                        if (a != null && (obj2 = a.toString()) != null) {
                            ikv0.a aVar2 = new ikv0.a(bo);
                            aVar2.u = new ikv0.d(obj2, (String) null, (ikv0.d.a) null, 6);
                            aVar2.l = 80;
                            aVar2.p(window);
                        }
                    }
                }
                return s3q0.a;
            case 9:
                L.i((Throwable) obj);
                return s3q0.a;
            case 10:
                float floatValue = ((Number) obj).floatValue();
                cys0 cys0Var = (cys0) this.receiver;
                cys0Var.p0 = floatValue;
                cys0Var.q();
                return s3q0.a;
            case 11:
                ((yau0) this.receiver).b();
                return s3q0.a;
            default:
                return ((AuthModel) this.receiver).c((String) obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5e(Object obj, int i) {
        super(1, obj, c4e.class, "mapPlaylist", "mapPlaylist(Lcom/vk/api/generated/shortVideo/dto/ShortVideoPlaylistFullDto;)Lcom/vk/clips/favorites/api/model/ClipsFavoriteFolder;", 0);
        this.b = i;
        switch (i) {
            case 5:
                super(1, obj, com.vk.metrics.eventtracking.b.class, "logException", "logException(Ljava/lang/Throwable;)V", 0);
                break;
            case 9:
                super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
            case 11:
                super(1, obj, yau0.class, "showError", "showError(Ljava/lang/Throwable;)V", 0);
                break;
            default:
                break;
        }
    }
}
