package xsna;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.opengl.GLES20;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl;
import com.vk.bridges.di.BridgeComponent;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.arguments.ClipsWrapperInputArguments;
import com.vk.core.apps.BuildInfo;
import com.vk.dialogsscreen.impl.GroupDialogsScreenFragment;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachImage;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.ImageCropData;
import com.vk.editor.di.StoryEditorExtDepsComponent;
import com.vk.feed.tool.view.newsfeed.image.FixedSizeVKEnhancedImageView;
import com.vk.im.reporters.api.dialog.OpenChatListReporter;
import com.vk.im.ui.components.contacts.vc.ContactsViews;
import com.vk.im.ui.fragments.ImDialogsSelectionFragment;
import com.vk.musc.kidsmode.api.di.MusicKidsModeComponent;
import com.vk.music.playlist.display.presentation.DisplayMusicPlaylistFragment;
import com.vk.music.view.vkmix.gl.GLShaderId;
import com.vk.newsfeed.common.views.header.CompactHeaderAvatarView;
import com.vk.newsfeed.impl.fragments.EntriesListFragment;
import com.vk.notifications.di.NotificationsComponent;
import com.vk.notifications.settings.CommunitiesManageNotificationsFragment;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.queue.di.QueueSyncComponent;
import com.vk.story.api.di.StoriesComponent;
import com.vk.video.profile.presentation.a;
import com.vkontakte.android.R;
import java.nio.IntBuffer;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.z4h;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class xqf implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xqf(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v139, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v74, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v63, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v23, types: [T, androidx.recyclerview.widget.RecyclerView$Adapter] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        Set<ContactsViews> set;
        FixedSizeVKEnhancedImageView fixedSizeVKEnhancedImageView;
        RectF rectF;
        double width;
        double d;
        double height;
        FixedSizeVKEnhancedImageView fixedSizeVKEnhancedImageView2;
        a1w a1wVar;
        int i = 0;
        switch (this.b) {
            case 0:
                ClipsWrapperFragment clipsWrapperFragment = (ClipsWrapperFragment) this.c;
                int i2 = ClipsWrapperFragment.Q0;
                return new ClipsWrapperInputArguments(new ClipsWrapperFragment.h(0, clipsWrapperFragment, ClipsWrapperFragment.class, "getArguments", "getArguments()Landroid/os/Bundle;", 0));
            case 1:
                return ((BridgeComponent) this.c).F();
            case 2:
                ((wlg) this.c).c.invoke(a.a0.b);
                return s3q0.a;
            case 3:
                return ((QueueSyncComponent) this.c).i0();
            case 4:
                CommunitiesManageNotificationsFragment communitiesManageNotificationsFragment = (CommunitiesManageNotificationsFragment) this.c;
                int i3 = CommunitiesManageNotificationsFragment.Z;
                return ((NotificationsComponent) m7m.d(communitiesManageNotificationsFragment).a(fpf0.a(NotificationsComponent.class))).b();
            case 5:
                h5h h5hVar = (h5h) this.c;
                CommunityProfileAction.CommunityInternalMenuAction.CommunityMenuActionType communityMenuActionType = CommunityProfileAction.CommunityInternalMenuAction.CommunityMenuActionType.EDIT_ORDER;
                h5hVar.B6(false);
                h5hVar.n.invoke(new CommunityProfileAction.CommunityInternalMenuAction(communityMenuActionType, (z4h.a) h5hVar.m, Integer.valueOf(((wak0) h5hVar.o).getIntValue())));
                return s3q0.a;
            case 6:
                return CompactHeaderAvatarView.b((CompactHeaderAvatarView) this.c);
            case 7:
                return new qrf0((t3j) this.c);
            case 8:
                com.vk.im.ui.components.contacts.a aVar = (com.vk.im.ui.components.contacts.a) this.c;
                b25 a = o25.a();
                a1w a1wVar2 = aVar.i;
                Set<ContactsViews> set2 = aVar.n;
                Peer q = a1wVar2.q();
                cau0 cau0Var = a1wVar2.r().h;
                q.getClass();
                if (!q.Ab(Peer.Type.GROUP) && (!o25.b(a) || a.i().S)) {
                    set = set2;
                } else {
                    Set y0 = rl3.y0(new ContactsViews[]{ContactsViews.REQUEST_PERMISSION, ContactsViews.CREATE_CONTACT, ContactsViews.INVITE});
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    for (Object obj : set2) {
                        if (!y0.contains((ContactsViews) obj)) {
                            linkedHashSet.add(obj);
                        }
                    }
                    set = linkedHashSet;
                }
                zwi c = ((f1w) aVar.S.getValue()).c();
                cau0 cau0Var2 = aVar.k;
                boolean z = aVar.o;
                boolean z2 = aVar.u;
                String str = aVar.x;
                Set<Long> set3 = aVar.D;
                xcd xcdVar = new xcd(aVar, 10);
                k7f k7fVar = new k7f(aVar, 5);
                boolean z3 = aVar.A;
                boolean booleanValue = ((Boolean) aVar.Q.getValue()).booleanValue();
                boolean d1 = aVar.d1();
                boolean z4 = aVar.H;
                boolean z5 = aVar.I;
                boolean z6 = aVar.J;
                boolean z7 = aVar.K;
                aVar.l.B();
                return new com.vk.im.ui.components.contacts.b(c, cau0Var2, set, z, z2, str, set3, xcdVar, k7fVar, z3, booleanValue, d1, z4, z5, z6, z7);
            case 9:
                return (mkj) ((d14) this.c).invoke();
            case 10:
                fck fckVar = (fck) this.c;
                qcy<Object>[] qcyVarArr = fck.t1;
                return ((StoriesComponent) m7m.d(fckVar).a(fpf0.a(StoriesComponent.class))).w();
            case 11:
                chk chkVar = (chk) this.c;
                RectF rectF2 = chkVar.d;
                FixedSizeVKEnhancedImageView fixedSizeVKEnhancedImageView3 = chkVar.a;
                rectF2.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, fixedSizeVKEnhancedImageView3.getMeasuredWidth(), fixedSizeVKEnhancedImageView3.getMeasuredHeight());
                Matrix matrix = chkVar.b;
                ImageCropData imageCropData = chkVar.e;
                if (imageCropData != null) {
                    int b = an10.b(chkVar.f);
                    int b2 = an10.b(chkVar.g);
                    if (imageCropData.d() != 0 || imageCropData.e() != 0 || imageCropData.c() != b || imageCropData.a() != b2) {
                        double c2 = imageCropData.c();
                        double a2 = imageCropData.a();
                        double d2 = chkVar.f / chkVar.g;
                        double d3 = c2 / a2;
                        Float f = chkVar.h;
                        if (f != null) {
                            fixedSizeVKEnhancedImageView = fixedSizeVKEnhancedImageView3;
                            width = f.floatValue();
                            rectF = rectF2;
                        } else {
                            fixedSizeVKEnhancedImageView = fixedSizeVKEnhancedImageView3;
                            rectF = rectF2;
                            width = rectF2.width() / rectF2.height();
                        }
                        double d4 = width;
                        double width2 = rectF.width();
                        double width3 = rectF.width() / d4;
                        if (d2 >= 1.0d) {
                            width3 = width2 / d2;
                        } else {
                            width2 = width3 * d2;
                        }
                        double d5 = width2;
                        double d6 = width3;
                        double floor = Math.floor(d5);
                        double floor2 = Math.floor(d6);
                        double d7 = chkVar.f / floor;
                        if (d2 < d4) {
                            d = d7;
                            height = floor / rectF.width();
                        } else {
                            d = d7;
                            height = floor2 / rectF.height();
                        }
                        double d8 = height;
                        double c3 = ((chkVar.f / 2.0f) - ((imageCropData.c() / 2.0f) + imageCropData.d())) / d;
                        double a3 = ((chkVar.g / 2.0f) - ((imageCropData.a() / 2.0f) + imageCropData.e())) / d;
                        double d9 = (d2 < d3 ? chkVar.f / c2 : chkVar.g / a2) / d8;
                        if (Math.abs(c3) > Double.MAX_VALUE || Math.abs(a3) > Double.MAX_VALUE || Math.abs(d9) > Double.MAX_VALUE) {
                            fixedSizeVKEnhancedImageView2 = fixedSizeVKEnhancedImageView;
                            fixedSizeVKEnhancedImageView2.setTransformMatrix(null);
                            return s3q0.a;
                        }
                        matrix.reset();
                        matrix.postTranslate((float) c3, (float) a3);
                        float f2 = (float) d9;
                        matrix.postScale(f2, f2, rectF.centerX(), rectF.centerY());
                        fixedSizeVKEnhancedImageView.setTransformMatrix(matrix);
                        return s3q0.a;
                    }
                }
                fixedSizeVKEnhancedImageView2 = fixedSizeVKEnhancedImageView3;
                fixedSizeVKEnhancedImageView2.setTransformMatrix(null);
                return s3q0.a;
            case 12:
                Context context = ((w1l) this.c).a;
                asu0.a.getClass();
                return new zdh0(asu0.n(), context);
            case 13:
                return (ViewGroup) ((ViewStub) ((View) this.c).findViewById(R.id.dialog_header_container_stub)).inflate();
            case 14:
                ism ismVar = (ism) this.c;
                a1w a1wVar3 = ismVar.a;
                ismVar.o();
                return new ysm(a1wVar3, 30, ismVar.d.f());
            case 15:
                final r3n r3nVar = (r3n) this.c;
                final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                ?? adapter = r3nVar.a.getAdapter();
                ref$ObjectRef.element = adapter;
                if (adapter instanceof pd90) {
                    ref$ObjectRef.element = ((pd90) adapter).c;
                }
                final mf7 mf7Var = (mf7) ref$ObjectRef.element;
                oog0 oog0Var = new oog0(iah0.b(18.0f), iah0.a(8), new mf7() { // from class: xsna.p3n
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
                    @Override // xsna.mf7
                    public final int e0(int i4) {
                        int e0 = mf7.this.e0(i4);
                        ?? r1 = r3nVar.c;
                        if (((Boolean) r1.getValue()).booleanValue()) {
                            return e0;
                        }
                        if (i4 == 0) {
                            e0 = (e0 & (-3)) | 1;
                        }
                        if (e0 == 0) {
                            e0 = 1;
                        }
                        return (i4 != ((RecyclerView.Adapter) ref$ObjectRef.element).getItemCount() - 1 || ((Boolean) r1.getValue()).booleanValue()) ? e0 : (e0 & (-5)) | 1;
                    }
                });
                oog0Var.n = true;
                oog0Var.o = ((Boolean) r3nVar.c.getValue()).booleanValue();
                return oog0Var;
            case 16:
                DisplayMusicPlaylistFragment displayMusicPlaylistFragment = (DisplayMusicPlaylistFragment) this.c;
                int i4 = DisplayMusicPlaylistFragment.b0;
                return ((MusicKidsModeComponent) m7m.d(displayMusicPlaylistFragment).a(fpf0.a(MusicKidsModeComponent.class))).n();
            case 17:
                return (ProgressBar) ((qxo) this.c).c.findViewById(R.id.vk_multi_account_progress_bar);
            case 18:
                return ((StoryEditorExtDepsComponent) ((k7m) m7m.f((m5p) this.c)).a(fpf0.a(StoryEditorExtDepsComponent.class))).K2();
            case 19:
                EntriesListFragment entriesListFragment = (EntriesListFragment) this.c;
                int i5 = EntriesListFragment.m0;
                return ((StoriesComponent) m7m.d(entriesListFragment).a(fpf0.a(StoriesComponent.class))).w();
            case 20:
                return ((rpv) ((q6r) this.c).a.getValue()).f.c;
            case 21:
                ((yis) this.c).D6();
                return s3q0.a;
            case 22:
                String value = ((k2t) this.c).b.invoke().a(GLShaderId.Vertex).getValue();
                int glCreateShader = GLES20.glCreateShader(35633);
                GLES20.glShaderSource(glCreateShader, value);
                GLES20.glCompileShader(glCreateShader);
                IntBuffer allocate = IntBuffer.allocate(1);
                GLES20.glGetShaderiv(glCreateShader, 35713, allocate);
                if (allocate.get(0) == 0) {
                    Log.e("createShader", GLES20.glGetShaderInfoLog(glCreateShader));
                }
                return Integer.valueOf(glCreateShader);
            case 23:
                GalleryFragmentImpl galleryFragmentImpl = (GalleryFragmentImpl) this.c;
                int i6 = GalleryFragmentImpl.R0;
                ((j3t) galleryFragmentImpl.G0.getValue()).b = 0;
                com.vk.lists.c cVar = galleryFragmentImpl.f0;
                if (cVar != null) {
                    cVar.p(false);
                }
                return s3q0.a;
            case 24:
                return ((GroupDialogsScreenFragment) this.c).X.a(OpenChatListReporter.Span.ON_CREATE_VIEW);
            case 25:
                v3v v3vVar = (v3v) this.c;
                final long j = v3vVar.b;
                final UserId userId = v3vVar.c;
                return v3vVar.d ? new t3v(i) : new izs() { // from class: xsna.u3v
                    @Override // xsna.izs
                    public final Object invoke(Object obj2) {
                        boolean z8;
                        Attach attach = (Attach) obj2;
                        if (attach instanceof AttachImage) {
                            AttachImage attachImage = (AttachImage) attach;
                            if (attachImage.e == j && epx.f(attachImage.d, userId)) {
                                z8 = true;
                                return Boolean.valueOf(z8);
                            }
                        }
                        z8 = false;
                        return Boolean.valueOf(z8);
                    }
                };
            case 26:
                ImDialogsSelectionFragment imDialogsSelectionFragment = (ImDialogsSelectionFragment) this.c;
                int i7 = ImDialogsSelectionFragment.n0;
                Peer peer = (Peer) imDialogsSelectionFragment.P.getValue();
                if (!(BuildInfo.s() && peer.Ab(Peer.Type.GROUP)) ? (a1wVar = q1w.a) != null : (a1wVar = q1w.b) != null) {
                    return null;
                }
                return a1wVar;
            case 27:
                w8q w8qVar = new w8q((n1y) this.c, 15);
                n36 n36Var = new n36();
                n36Var.a = w8qVar;
                return n36Var;
            case 28:
                return new p0r0((Context) this.c, "users.exchange.db.local");
            default:
                return Boolean.valueOf(((dc10) ((tc10) this.c).a).P() != null);
        }
    }
}
