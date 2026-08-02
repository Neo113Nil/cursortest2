package xsna;

import android.graphics.Bitmap;
import android.view.ActionMode;
import android.view.ViewGroup;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import com.vk.camera.clips.core.drafts.ClipsDraftVk;
import com.vk.channels.api.Channel;
import com.vk.clips.favorites.impl.ui.folders.renaming.view.ClipsFolderNameFormField;
import com.vk.clips.sdk.drafts.dbmodels.ClipsDraftCommonData;
import com.vk.clips.upload.vk.ui.impl.fragment.ClipsUploadFragmentImpl;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.posting.PostingVisibilityMode;
import com.vk.im.engine.models.attaches.AttachVideo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.libvideo.bottomsheet.about.delegate.a0;
import com.vk.log.L;
import com.vk.newsfeed.posting.mediapicker.photovk.base.BasePhotoListFragment;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import com.vk.toggle.features.ClipsFeatures;
import com.vk.voip.ui.broadcast.fragments.config.BroadcastConfigFragment;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.b4;
import xsna.bex0;
import xsna.c7g0;
import xsna.cce;
import xsna.cue;
import xsna.dob;
import xsna.du;
import xsna.gm50;
import xsna.knb;
import xsna.lbf;
import xsna.ond;
import xsna.q8v;
import xsna.tj50;
import xsna.uuf;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class s9 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s9(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v104, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.wzs] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Object obj2;
        ubb ubbVar;
        q8v.c cVar;
        int i;
        LinkedHashMap linkedHashMap;
        Iterator it;
        char c;
        Iterator it2;
        Object obj3;
        char c2 = 5;
        int i2 = 0;
        switch (this.b) {
            case 0:
                ((a0.a) this.c).l.d(b4.j0.a);
                return s3q0.a;
            case 1:
                x60 x60Var = (x60) this.c;
                Throwable th = (Throwable) obj;
                L.j(th, "Offline:ActionRemoteRepositoryImpl", "Error sending delete like action " + ((Object) b70.c(x60Var.a)) + " to backend.");
                com.vk.metrics.eventtracking.b.a.a(th);
                return io.reactivex.rxjava3.core.x.k(((th instanceof VKApiExecutionException) && ((VKApiExecutionException) th).s() == -1) ? new du.a(x60Var) : new du.c(x60Var));
            case 2:
                dw20 dw20Var = (dw20) ((Ref$ObjectRef) this.c).element;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                return s3q0.a;
            case 3:
                ActionMode actionMode = ((uc2) this.c).h;
                if (actionMode != null) {
                    actionMode.invalidateContentRect();
                }
                return s3q0.a;
            case 4:
                Throwable th2 = (Throwable) obj;
                r6y r6yVar = ((yt3) this.c).b;
                if (r6yVar != null) {
                    bex0.a.a(r6yVar, JsApiMethodType.ASK_WORKOUT_PERMISSIONS, VkAppsErrors.Client.CUSTOM_ERROR, th2.getMessage(), null, null, 56);
                }
                return s3q0.a;
            case 5:
                return Boolean.valueOf(epx.f(((Map.Entry) obj).getKey(), (ko4) this.c));
            case 6:
                ((vu4) this.c).Z0((Throwable) obj);
                return s3q0.a;
            case 7:
                ((fh5) this.c).P0();
                return s3q0.a;
            case 8:
                BasePhotoListFragment basePhotoListFragment = (BasePhotoListFragment) this.c;
                int i3 = BasePhotoListFragment.l0;
                basePhotoListFragment.getClass();
                return s3q0.a;
            case 9:
                return new z68((ViewGroup) obj, ((com.vk.newsfeed.impl.posting.viewpresenter.bottom.attachment.a) this.c).i);
            case 10:
                pd8 pd8Var = (pd8) this.c;
                int i4 = BroadcastConfigFragment.U;
                pd8Var.a((qd8) ((it80) obj).a);
                return s3q0.a;
            case 11:
                Bitmap bitmap = (Bitmap) obj;
                yaa0 yaa0Var = ((tam0) this.c).a;
                if (yaa0Var != null) {
                    yaa0Var.b = bitmap;
                }
                return s3q0.a;
            case 12:
                return bha.P4((bha) this.c);
            case 13:
                ((gzs) this.c).invoke();
                return s3q0.a;
            case 14:
                ubb ubbVar2 = (ubb) this.c;
                q8v q8vVar = (q8v) obj;
                if (q8vVar instanceof q8v.c) {
                    q8v.c cVar2 = (q8v.c) q8vVar;
                    LinkedHashMap linkedHashMap2 = ubbVar2.r;
                    Iterator it3 = linkedHashMap2.entrySet().iterator();
                    while (it3.hasNext()) {
                        Map.Entry entry = (Map.Entry) it3.next();
                        String str = (String) entry.getKey();
                        MsgFromChannel msgFromChannel = (MsgFromChannel) entry.getValue();
                        Iterator<T> it4 = cVar2.a.b.k().iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                obj2 = it4.next();
                                Msg msg = (Msg) obj2;
                                if (!(msg instanceof MsgFromChannel) || !epx.f(((MsgFromChannel) msg).P, str) || msg.d == 0) {
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        MsgFromChannel msgFromChannel2 = obj2 instanceof MsgFromChannel ? (MsgFromChannel) obj2 : null;
                        if (msgFromChannel2 != null) {
                            ttp0.c(linkedHashMap2).remove(msgFromChannel2.P);
                            MsgFromChannel msgFromChannel3 = new MsgFromChannel(msgFromChannel2);
                            List<Attach> list = msgFromChannel3.E;
                            ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                            for (Attach attach : list) {
                                if (attach instanceof AttachVideo) {
                                    Iterator<T> it5 = msgFromChannel.E.iterator();
                                    while (true) {
                                        if (it5.hasNext()) {
                                            obj3 = it5.next();
                                            Attach attach2 = (Attach) obj3;
                                            if (!(attach2 instanceof AttachVideo) || ((AttachVideo) attach2).getId() != ((AttachVideo) attach).getId()) {
                                            }
                                        } else {
                                            obj3 = null;
                                        }
                                    }
                                    Attach attach3 = (Attach) obj3;
                                    if (attach3 != null) {
                                        attach = attach3;
                                    }
                                }
                                arrayList.add(attach);
                            }
                            msgFromChannel3.E = new ArrayList(arrayList);
                            q8b q8bVar = ubbVar2.o;
                            int i5 = msgFromChannel3.d;
                            Channel P0 = ubbVar2.p.P0();
                            int i6 = 15;
                            v5 v5Var = new v5(ubbVar2, i6);
                            w5 w5Var = new w5(ubbVar2, i6);
                            q8bVar.getClass();
                            long j = P0.A.d;
                            long j2 = P0.b;
                            String str2 = P0.d;
                            String Db = P0.c.Db();
                            if (Db == null) {
                                Db = "";
                            }
                            String str3 = Db;
                            List<Attach> list2 = msgFromChannel3.E;
                            ArrayList arrayList2 = new ArrayList();
                            for (Attach attach4 : list2) {
                                ubb ubbVar3 = ubbVar2;
                                long j3 = j2;
                                q8v.c cVar3 = cVar2;
                                LinkedHashMap linkedHashMap3 = linkedHashMap2;
                                pbm0 pbm0Var = null;
                                Attachment b = wdw.b(attach4, null, false, 6);
                                if (b == null) {
                                    it2 = it3;
                                } else {
                                    it2 = it3;
                                    pbm0Var = new pbm0(b, new xk(5, attach4, q8bVar), false);
                                }
                                if (pbm0Var != null) {
                                    arrayList2.add(pbm0Var);
                                }
                                cVar2 = cVar3;
                                linkedHashMap2 = linkedHashMap3;
                                j2 = j3;
                                ubbVar2 = ubbVar3;
                                it3 = it2;
                            }
                            ubbVar = ubbVar2;
                            cVar = cVar2;
                            linkedHashMap = linkedHashMap2;
                            it = it3;
                            i = 0;
                            c = 5;
                            ((l8c0) q8bVar.a.getValue()).b(new c7g0.a(new p3c0(j, j2, i5, str2, str3, arrayList2, msgFromChannel3.I.a), v5Var, w5Var, "IM_CHANNEL".toLowerCase(Locale.ROOT)));
                        } else {
                            ubbVar = ubbVar2;
                            cVar = cVar2;
                            i = i2;
                            linkedHashMap = linkedHashMap2;
                            it = it3;
                            c = c2;
                        }
                        i2 = i;
                        c2 = c;
                        linkedHashMap2 = linkedHashMap;
                        ubbVar2 = ubbVar;
                        it3 = it;
                        cVar2 = cVar;
                    }
                }
                return s3q0.a;
            case 15:
                nnb nnbVar = (nnb) this.c;
                DialogExt dialogExt = ((knb.c) obj).b;
                Dialog Cb = dialogExt.Cb();
                return new dob.h(dialogExt, (Cb == null || !Cb.Gb() || Cb.Jc()) ? false : true, nnbVar.d.get());
            case 16:
                cxb cxbVar = (cxb) this.c;
                DialogExt dialogExt2 = (DialogExt) obj;
                o0w.x(cxbVar.g.b(), cxbVar.b, null, dialogExt2.e, dialogExt2, null, null, false, null, null, null, null, null, null, "create_conversation", null, null, null, false, null, null, null, null, null, 1073733618);
                return s3q0.a;
            case 17:
                sgc sgcVar = (sgc) this.c;
                pno0 pno0Var = (pno0) obj;
                int i7 = sgc.n1;
                rgc rgcVar = (rgc) sgcVar.f1;
                if (rgcVar != null) {
                    rgcVar.k0(pno0Var.d());
                }
                return s3q0.a;
            case 18:
                frc frcVar = (frc) this.c;
                frcVar.f = (File) frcVar.g.getValue();
                return s3q0.a;
            case 19:
                return o1d.x((o1d) this.c, (j2d) obj);
            case 20:
                ((x6d) this.c).e.a.a(v5d.b);
                return s3q0.a;
            case 21:
                snd sndVar = (snd) this.c;
                ond.a aVar = (ond.a) obj;
                if (aVar instanceof ond.a.C3457a) {
                    sndVar.M7(((ond.a.C3457a) aVar).a);
                } else if (aVar instanceof ond.a.b) {
                    sndVar.N7(((ond.a.b) aVar).a);
                } else {
                    if (!(aVar instanceof ond.a.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    sndVar.O7(((ond.a.c) aVar).a);
                }
                return s3q0.a;
            case 22:
                com.vk.clips.editor.voiceover.impl.a aVar2 = (com.vk.clips.editor.voiceover.impl.a) this.c;
                aVar2.k.onNext(Integer.valueOf(aVar2.b().b.getMaxAmplitude()));
                return s3q0.a;
            case 23:
                ClipsFolderNameFormField clipsFolderNameFormField = (ClipsFolderNameFormField) this.c;
                tho0 tho0Var = (tho0) obj;
                int i8 = ClipsFolderNameFormField.p;
                us2 us2Var = tho0Var.a;
                int length = us2Var.c.length();
                int i9 = clipsFolderNameFormField.o;
                if (length > i9) {
                    tho0Var = tho0.b(tho0Var, us2Var.subSequence(0, Math.min(us2Var.c.length(), i9)), 0L, 6);
                }
                clipsFolderNameFormField.setFolderName(tho0Var);
                clipsFolderNameFormField.getOnUpdateAction().invoke(tho0Var);
                return s3q0.a;
            case 24:
                com.vk.clips.sdk.shared.item.clips_grid_block.presentation.b bVar = (com.vk.clips.sdk.shared.item.clips_grid_block.presentation.b) this.c;
                cce.e eVar = (cce.e) obj;
                gm50.a.a(bVar, eVar.a, new lbe(bVar, i2));
                gm50.a.a(bVar, eVar.b, new t9(bVar, 28));
                int i10 = 23;
                gm50.a.a(bVar, eVar.c, new t40(bVar, i10));
                gm50.a.a(bVar, eVar.d, new xr0(12));
                gm50.a.a(bVar, eVar.e, new w5(bVar, i10));
                gm50.a.a(bVar, eVar.f, new on(bVar, 20));
                return s3q0.a;
            case 25:
                uee ueeVar = (uee) obj;
                ?? r1 = ((zde) this.c).i;
                ClipVideoFile clipVideoFile = ueeVar.a;
                ceq0 ceq0Var = ueeVar.b;
                r1.invoke(clipVideoFile, ceq0Var != null ? Integer.valueOf(ceq0Var.b()) : null);
                return s3q0.a;
            case 26:
                tj50.a aVar3 = (tj50.a) obj;
                bue bueVar = (bue) ((xte) this.c).d.getValue();
                bueVar.getClass();
                r6 r6Var = new r6(bueVar, 24);
                ao8 ao8Var = ao8.d;
                return new cue.a.b(aVar3.a(r6Var, ao8Var), aVar3.a(new wq3(13), ao8Var), aVar3.a(new y40(17), ao8Var), aVar3.a(new rl2(9), ao8Var), aVar3.a(new ci7(bueVar, 14), ao8Var));
            case 27:
                ClipsDraftVk clipsDraftVk = (ClipsDraftVk) this.c;
                ClipsDraftCommonData clipsDraftCommonData = clipsDraftVk.b;
                ClipsDraftPersistentStore clipsDraftPersistentStore = (ClipsDraftPersistentStore) obj;
                if (com.vk.toggle.b.A.a(ClipsFeatures.CLIP_CREATE_SESSION_DATA_COLLECTOR)) {
                    String str4 = clipsDraftCommonData.b;
                    clipsDraftPersistentStore.getClass();
                    ClipsDraftPersistentStore.q(str4, false, false);
                } else {
                    ClipsDraftPersistentStore.r(clipsDraftPersistentStore, clipsDraftCommonData.b, 2);
                    asu0.a.getClass();
                    asu0.n().execute(new cs2(clipsDraftVk, 5));
                }
                clipsDraftPersistentStore.getClass();
                ClipsDraftPersistentStore.s();
                if (fxc0.B().o0()) {
                    wjs0.a(qwr0.a);
                }
                return s3q0.a;
            case 28:
                hjf hjfVar = (hjf) this.c;
                String str5 = ClipsUploadFragmentImpl.a0;
                hjfVar.b(new lbf.c.s.b((PostingVisibilityMode) obj));
                return s3q0.a;
            default:
                uuf.c cVar4 = (uuf.c) this.c;
                wuf wufVar = (wuf) obj;
                int i11 = ClipsWrapperFragment.Q0;
                if (cVar4.e() != (wufVar.g().getVisibility() == 0)) {
                    awt0.u(wufVar.g(), cVar4.e());
                }
                if (cVar4.e() != (wufVar.m().getVisibility() == 0)) {
                    awt0.u(wufVar.m(), cVar4.e());
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ s9(x60 x60Var, r40 r40Var) {
        this.b = 1;
        this.c = x60Var;
    }
}
