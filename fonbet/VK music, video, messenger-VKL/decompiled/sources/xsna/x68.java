package xsna;

import android.app.Activity;
import android.content.Context;
import com.android.billingclient.api.Purchase;
import com.vk.billing.GoogleStorePurchasesManagerImpl;
import com.vk.billing.StorePurchasesManager;
import com.vk.dto.common.Attachment;
import com.vk.dto.group.Group;
import com.vk.video.ui.upload.impl.publish.presentation.publish.compose.dialog.exitconfirm.ExitConfirmDialogViewState;
import com.vk.video.ui.upload.impl.publish.presentation.publish.feature.entity.PublishState;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.BookingAttachment;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import xsna.ihc0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class x68 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ x68(Object obj, boolean z, int i) {
        this.b = i;
        this.d = obj;
        this.c = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x026e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01d4  */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean od;
        qdc0 qdc0Var;
        boolean z4;
        Boolean valueOf;
        Boolean bool;
        boolean z5;
        qdc0 qdc0Var2;
        boolean z6;
        List<Attachment> u;
        List<Attachment> list;
        Iterator<T> it;
        List<Attachment> u2;
        List<Attachment> list2;
        Iterator<T> it2;
        qdc0 qdc0Var3;
        qdc0 qdc0Var4;
        List<Purchase> list3;
        Object obj2;
        StorePurchasesManager.a<D> aVar;
        switch (this.b) {
            case 0:
                com.vk.newsfeed.impl.posting.viewpresenter.bottom.attachment.d dVar = (com.vk.newsfeed.impl.posting.viewpresenter.bottom.attachment.d) this.d;
                ihc0 ihc0Var = (ihc0) obj;
                ihc0.a aVar2 = ihc0Var.a;
                boolean z7 = this.c;
                ihc0Var.a = ihc0.a.a(aVar2, false, z7, 1);
                ihc0.a aVar3 = ihc0Var.c;
                if (z7) {
                    qdc0 qdc0Var5 = dVar.f;
                    if (!(qdc0Var5 != null ? qdc0Var5.Bc(7) : true)) {
                        z = true;
                        ihc0Var.c = ihc0.a.a(aVar3, false, z, 1);
                        ihc0Var.b = ihc0.a.a(ihc0Var.b, false, z7, 1);
                        ihc0.a aVar4 = ihc0Var.f;
                        if (z7) {
                            qdc0 qdc0Var6 = dVar.f;
                            if (!(qdc0Var6 != null ? qdc0Var6.Bc(8) : true)) {
                                z2 = true;
                                ihc0Var.f = ihc0.a.a(aVar4, false, z2, 1);
                                ihc0.a aVar5 = ihc0Var.i;
                                if (z7) {
                                    qdc0 qdc0Var7 = dVar.f;
                                    if (!(qdc0Var7 != null ? qdc0Var7.Bc(4) : true)) {
                                        z3 = true;
                                        ihc0Var.i = ihc0.a.a(aVar5, false, z3, 1);
                                        ihc0Var.d = ihc0.a.a(ihc0Var.d, false, z7, 1);
                                        ihc0Var.h = ihc0.a.a(ihc0Var.h, false, !z7 && ((qdc0Var4 = dVar.f) == null || !qdc0Var4.X4()), 1);
                                        ihc0Var.g = ihc0.a.a(ihc0Var.g, false, !z7 && ((qdc0Var3 = dVar.f) == null || !qdc0Var3.X4()), 1);
                                        qdc0 qdc0Var8 = dVar.f;
                                        boolean Cc = qdc0Var8 == null ? qdc0Var8.Cc() : false;
                                        qdc0 qdc0Var9 = dVar.f;
                                        od = qdc0Var9 == null ? qdc0Var9.od() : false;
                                        qdc0Var = dVar.f;
                                        if (qdc0Var != null && (u2 = qdc0Var.u()) != null) {
                                            list2 = u2;
                                            if ((list2 instanceof Collection) || !list2.isEmpty()) {
                                                it2 = list2.iterator();
                                                while (it2.hasNext()) {
                                                    if (((Attachment) it2.next()) instanceof f010) {
                                                    }
                                                }
                                            }
                                            z4 = true;
                                            ihc0.a aVar6 = ihc0Var.j;
                                            qdc0 qdc0Var10 = dVar.f;
                                            valueOf = qdc0Var10 == null ? Boolean.valueOf(qdc0Var10.nb()) : null;
                                            bool = Boolean.TRUE;
                                            if (epx.f(valueOf, bool)) {
                                                qdc0 qdc0Var11 = dVar.f;
                                                if (!epx.f(qdc0Var11 != null ? Boolean.valueOf(qdc0Var11.yd()) : null, bool) && !Cc) {
                                                    z5 = true;
                                                    qdc0Var2 = dVar.f;
                                                    if (qdc0Var2 != null && (u = qdc0Var2.u()) != null) {
                                                        list = u;
                                                        if ((list instanceof Collection) || !list.isEmpty()) {
                                                            it = list.iterator();
                                                            while (it.hasNext()) {
                                                                if (((Attachment) it.next()) instanceof BookingAttachment) {
                                                                }
                                                            }
                                                        }
                                                        z6 = true;
                                                        aVar6.getClass();
                                                        ihc0Var.j = new ihc0.a(z5, z6);
                                                        ihc0.a aVar7 = ihc0Var.k;
                                                        boolean z8 = (!od && z4) || od;
                                                        aVar7.getClass();
                                                        ihc0Var.k = new ihc0.a(Cc, z8);
                                                        return s3q0.a;
                                                    }
                                                    z6 = false;
                                                    aVar6.getClass();
                                                    ihc0Var.j = new ihc0.a(z5, z6);
                                                    ihc0.a aVar72 = ihc0Var.k;
                                                    if (od) {
                                                        aVar72.getClass();
                                                        ihc0Var.k = new ihc0.a(Cc, z8);
                                                        return s3q0.a;
                                                    }
                                                    aVar72.getClass();
                                                    ihc0Var.k = new ihc0.a(Cc, z8);
                                                    return s3q0.a;
                                                }
                                            }
                                            z5 = false;
                                            qdc0Var2 = dVar.f;
                                            if (qdc0Var2 != null) {
                                                list = u;
                                                if (list instanceof Collection) {
                                                }
                                                it = list.iterator();
                                                while (it.hasNext()) {
                                                }
                                                z6 = true;
                                                aVar6.getClass();
                                                ihc0Var.j = new ihc0.a(z5, z6);
                                                ihc0.a aVar722 = ihc0Var.k;
                                                if (od) {
                                                }
                                                aVar722.getClass();
                                                ihc0Var.k = new ihc0.a(Cc, z8);
                                                return s3q0.a;
                                            }
                                            z6 = false;
                                            aVar6.getClass();
                                            ihc0Var.j = new ihc0.a(z5, z6);
                                            ihc0.a aVar7222 = ihc0Var.k;
                                            if (od) {
                                            }
                                            aVar7222.getClass();
                                            ihc0Var.k = new ihc0.a(Cc, z8);
                                            return s3q0.a;
                                        }
                                        z4 = false;
                                        ihc0.a aVar62 = ihc0Var.j;
                                        qdc0 qdc0Var102 = dVar.f;
                                        if (qdc0Var102 == null) {
                                        }
                                        bool = Boolean.TRUE;
                                        if (epx.f(valueOf, bool)) {
                                        }
                                        z5 = false;
                                        qdc0Var2 = dVar.f;
                                        if (qdc0Var2 != null) {
                                        }
                                        z6 = false;
                                        aVar62.getClass();
                                        ihc0Var.j = new ihc0.a(z5, z6);
                                        ihc0.a aVar72222 = ihc0Var.k;
                                        if (od) {
                                        }
                                        aVar72222.getClass();
                                        ihc0Var.k = new ihc0.a(Cc, z8);
                                        return s3q0.a;
                                    }
                                }
                                z3 = false;
                                ihc0Var.i = ihc0.a.a(aVar5, false, z3, 1);
                                ihc0Var.d = ihc0.a.a(ihc0Var.d, false, z7, 1);
                                ihc0Var.h = ihc0.a.a(ihc0Var.h, false, !z7 && ((qdc0Var4 = dVar.f) == null || !qdc0Var4.X4()), 1);
                                ihc0Var.g = ihc0.a.a(ihc0Var.g, false, !z7 && ((qdc0Var3 = dVar.f) == null || !qdc0Var3.X4()), 1);
                                qdc0 qdc0Var82 = dVar.f;
                                if (qdc0Var82 == null) {
                                }
                                qdc0 qdc0Var92 = dVar.f;
                                if (qdc0Var92 == null) {
                                }
                                qdc0Var = dVar.f;
                                if (qdc0Var != null) {
                                    list2 = u2;
                                    if (list2 instanceof Collection) {
                                    }
                                    it2 = list2.iterator();
                                    while (it2.hasNext()) {
                                    }
                                    z4 = true;
                                    ihc0.a aVar622 = ihc0Var.j;
                                    qdc0 qdc0Var1022 = dVar.f;
                                    if (qdc0Var1022 == null) {
                                    }
                                    bool = Boolean.TRUE;
                                    if (epx.f(valueOf, bool)) {
                                    }
                                    z5 = false;
                                    qdc0Var2 = dVar.f;
                                    if (qdc0Var2 != null) {
                                    }
                                    z6 = false;
                                    aVar622.getClass();
                                    ihc0Var.j = new ihc0.a(z5, z6);
                                    ihc0.a aVar722222 = ihc0Var.k;
                                    if (od) {
                                    }
                                    aVar722222.getClass();
                                    ihc0Var.k = new ihc0.a(Cc, z8);
                                    return s3q0.a;
                                }
                                z4 = false;
                                ihc0.a aVar6222 = ihc0Var.j;
                                qdc0 qdc0Var10222 = dVar.f;
                                if (qdc0Var10222 == null) {
                                }
                                bool = Boolean.TRUE;
                                if (epx.f(valueOf, bool)) {
                                }
                                z5 = false;
                                qdc0Var2 = dVar.f;
                                if (qdc0Var2 != null) {
                                }
                                z6 = false;
                                aVar6222.getClass();
                                ihc0Var.j = new ihc0.a(z5, z6);
                                ihc0.a aVar7222222 = ihc0Var.k;
                                if (od) {
                                }
                                aVar7222222.getClass();
                                ihc0Var.k = new ihc0.a(Cc, z8);
                                return s3q0.a;
                            }
                        }
                        z2 = false;
                        ihc0Var.f = ihc0.a.a(aVar4, false, z2, 1);
                        ihc0.a aVar52 = ihc0Var.i;
                        if (z7) {
                        }
                        z3 = false;
                        ihc0Var.i = ihc0.a.a(aVar52, false, z3, 1);
                        ihc0Var.d = ihc0.a.a(ihc0Var.d, false, z7, 1);
                        ihc0Var.h = ihc0.a.a(ihc0Var.h, false, !z7 && ((qdc0Var4 = dVar.f) == null || !qdc0Var4.X4()), 1);
                        ihc0Var.g = ihc0.a.a(ihc0Var.g, false, !z7 && ((qdc0Var3 = dVar.f) == null || !qdc0Var3.X4()), 1);
                        qdc0 qdc0Var822 = dVar.f;
                        if (qdc0Var822 == null) {
                        }
                        qdc0 qdc0Var922 = dVar.f;
                        if (qdc0Var922 == null) {
                        }
                        qdc0Var = dVar.f;
                        if (qdc0Var != null) {
                        }
                        z4 = false;
                        ihc0.a aVar62222 = ihc0Var.j;
                        qdc0 qdc0Var102222 = dVar.f;
                        if (qdc0Var102222 == null) {
                        }
                        bool = Boolean.TRUE;
                        if (epx.f(valueOf, bool)) {
                        }
                        z5 = false;
                        qdc0Var2 = dVar.f;
                        if (qdc0Var2 != null) {
                        }
                        z6 = false;
                        aVar62222.getClass();
                        ihc0Var.j = new ihc0.a(z5, z6);
                        ihc0.a aVar72222222 = ihc0Var.k;
                        if (od) {
                        }
                        aVar72222222.getClass();
                        ihc0Var.k = new ihc0.a(Cc, z8);
                        return s3q0.a;
                    }
                }
                z = false;
                ihc0Var.c = ihc0.a.a(aVar3, false, z, 1);
                ihc0Var.b = ihc0.a.a(ihc0Var.b, false, z7, 1);
                ihc0.a aVar42 = ihc0Var.f;
                if (z7) {
                }
                z2 = false;
                ihc0Var.f = ihc0.a.a(aVar42, false, z2, 1);
                ihc0.a aVar522 = ihc0Var.i;
                if (z7) {
                }
                z3 = false;
                ihc0Var.i = ihc0.a.a(aVar522, false, z3, 1);
                ihc0Var.d = ihc0.a.a(ihc0Var.d, false, z7, 1);
                ihc0Var.h = ihc0.a.a(ihc0Var.h, false, !z7 && ((qdc0Var4 = dVar.f) == null || !qdc0Var4.X4()), 1);
                ihc0Var.g = ihc0.a.a(ihc0Var.g, false, !z7 && ((qdc0Var3 = dVar.f) == null || !qdc0Var3.X4()), 1);
                qdc0 qdc0Var8222 = dVar.f;
                if (qdc0Var8222 == null) {
                }
                qdc0 qdc0Var9222 = dVar.f;
                if (qdc0Var9222 == null) {
                }
                qdc0Var = dVar.f;
                if (qdc0Var != null) {
                }
                z4 = false;
                ihc0.a aVar622222 = ihc0Var.j;
                qdc0 qdc0Var1022222 = dVar.f;
                if (qdc0Var1022222 == null) {
                }
                bool = Boolean.TRUE;
                if (epx.f(valueOf, bool)) {
                }
                z5 = false;
                qdc0Var2 = dVar.f;
                if (qdc0Var2 != null) {
                }
                z6 = false;
                aVar622222.getClass();
                ihc0Var.j = new ihc0.a(z5, z6);
                ihc0.a aVar722222222 = ihc0Var.k;
                if (od) {
                }
                aVar722222222.getClass();
                ihc0Var.k = new ihc0.a(Cc, z8);
                return s3q0.a;
            case 1:
                Group group = (Group) this.d;
                if ((!this.c && group.n()) || group.C()) {
                    cvk.u(R.string.community_send_request_toast, false);
                }
                return s3q0.a;
            case 2:
                Context context = ((gce0) this.d).c;
                PublishState publishState = (PublishState) obj;
                return PublishState.a(publishState, null, null, null, null, false, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, false, null, null, false, false, new ExitConfirmDialogViewState(publishState.o() != null ? context.getString(R.string.video_upload_cancel_dialog_message_video) : context.getString(R.string.video_upload_cancel_dialog_message_edit)), this.c, false, null, false, false, false, false, -1, 2035);
            default:
                com.vk.billing.h hVar = (com.vk.billing.h) this.d;
                D d = hVar.d;
                l27 l27Var = (l27) obj;
                try {
                    list3 = l27Var.b;
                } catch (Exception unused) {
                    com.vk.billing.h.q();
                } catch (Throwable th) {
                    throw th;
                }
                if (l27Var.a.getResponseCode() != 0) {
                    throw new GoogleStorePurchasesManagerImpl.PayNotAvailableException();
                }
                Iterator<T> it3 = list3.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        obj2 = it3.next();
                        if (GoogleStorePurchasesManagerImpl.a.a((Purchase) obj2) == d.getId()) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                Purchase purchase = (Purchase) obj2;
                hVar.j = purchase;
                hVar.i = "subs";
                if (purchase != null) {
                    hVar.m(true, purchase);
                } else if (!this.c) {
                    Activity activity = hVar.f.get();
                    if (activity != null) {
                        o27 o27Var = hVar.b;
                        String L4 = d.L4();
                        String W6 = d.W6();
                        o27Var.getClass();
                        o27.f(activity, "subs", L4, W6);
                    }
                } else if (d != 0 && (aVar = hVar.e) != 0) {
                    aVar.d(d);
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ x68(boolean z, Object obj, int i) {
        this.b = i;
        this.c = z;
        this.d = obj;
    }
}
