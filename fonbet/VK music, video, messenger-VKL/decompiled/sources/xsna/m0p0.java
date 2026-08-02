package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.toggle.b;
import com.vk.toggle.internal.ToggleManager;
import java.util.concurrent.TimeUnit;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class m0p0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m0p0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ToggleManager toggleManager = (ToggleManager) obj2;
                b.d dVar = (b.d) obj;
                if (toggleManager.d(dVar)) {
                    toggleManager.q.put(dVar.b.toString(), dVar);
                }
                break;
            default:
                dks0 dks0Var = (dks0) obj2;
                c6s0 c6s0Var = dks0Var.e;
                bwr0 bwr0Var = (bwr0) obj;
                if (bwr0Var instanceof yxr0) {
                    dks0Var.c(new xxf0(((yxr0) bwr0Var).a().a1()));
                } else {
                    int i2 = 11;
                    int i3 = 3;
                    int i4 = 7;
                    boolean z = true;
                    char c = 1;
                    char c2 = 1;
                    char c3 = 1;
                    char c4 = 1;
                    boolean z2 = false;
                    Object[] objArr = 0;
                    if (bwr0Var instanceof hxr0) {
                        qon0 qon0Var = new qon0(4, new l4k0(i4), new oan0(i4));
                        hxr0 hxr0Var = (hxr0) bwr0Var;
                        VideoFile a = hxr0Var.a();
                        String str = "videos_like";
                        buz buzVar = new buz(12, a == null ? new yjs0(0) : new bks0(dks0Var, a, str, z), c6s0Var.a(bwr0Var));
                        VideoFile a2 = hxr0Var.a();
                        dks0Var.d(qon0Var, buzVar, new buz(12, a2 == null ? new yjs0(0) : new dnh0(i2, str, a2), c6s0Var.a(bwr0Var)));
                    } else if (bwr0Var instanceof dyr0) {
                        dyr0 dyr0Var = (dyr0) bwr0Var;
                        VideoFile a3 = dyr0Var.a();
                        String str2 = "videos_unlike";
                        buz buzVar2 = new buz(12, a3 == null ? new yjs0(0) : new bks0(dks0Var, a3, str2, z2), c6s0Var.a(bwr0Var));
                        VideoFile a4 = dyr0Var.a();
                        dks0Var.d(buzVar2, new buz(12, a4 == null ? new yjs0(0) : new dnh0(i2, str2, a4), c6s0Var.a(bwr0Var)));
                    } else {
                        int i5 = 8;
                        if (bwr0Var instanceof axr0) {
                            dks0Var.d(new qon0(4, new l4k0(i4), new xim0(dks0Var, 8)), new oon0("videos_bookmarks_add", null, false, false, 14));
                        } else if (bwr0Var instanceof cxr0) {
                            dks0Var.d(new oon0("videos_bookmarks_remove", null, false, false, 14), new qon0(4, new l4k0(i4), new hfm0(dks0Var, 14)));
                        } else {
                            int i6 = 24;
                            String str3 = null;
                            Object[] objArr2 = 0;
                            if (bwr0Var instanceof cwr0) {
                                oon0 oon0Var = new oon0("videos_add", null, false, false, 14);
                                cwr0 cwr0Var = (cwr0) bwr0Var;
                                if (cwr0Var.a() != null) {
                                    hg1.e(dks0Var.c, io.reactivex.rxjava3.core.x.t(1L, TimeUnit.SECONDS).m(asu0.a.d()).subscribe(new t5n0(new ync(dks0Var, oon0Var, new qon0(5, null, new ha40(i6)), 11), i3)));
                                } else {
                                    dks0Var.c(oon0Var);
                                }
                                VideoFile b = cwr0Var.b();
                                String a5 = cwr0Var.a();
                                dks0Var.c(new buz(12, (b == null || a5 == null) ? new yjs0(0) : new l9n(a5, 6), c6s0Var.a(bwr0Var)));
                            } else if (bwr0Var instanceof wxr0) {
                                wxr0 wxr0Var = (wxr0) bwr0Var;
                                VideoFile videoFile = wxr0Var.a;
                                dks0Var.d(new buz(12, videoFile == null ? new yjs0(0) : new bks0(dks0Var, videoFile, wxr0Var.b, c4 == true ? 1 : 0), c6s0Var.a(bwr0Var)), new qon0(5, null, new r5i0(10, dks0Var, wxr0Var)));
                            } else if (bwr0Var instanceof mxr0) {
                                dks0Var.d(new buz(12, new f6m0(((mxr0) bwr0Var).c(), 13), c6s0Var.a(bwr0Var)));
                            } else if (bwr0Var instanceof fwr0) {
                                dks0Var.d(new oon0("albums_add", null, false, false, 14));
                            } else if (bwr0Var instanceof jwr0) {
                                jwr0 jwr0Var = (jwr0) bwr0Var;
                                dks0Var.d(new oon0(jwr0Var.b(), null, false, false, 14), new buz(12, new xka0(jwr0Var.a(), i6), c6s0Var.a(bwr0Var)));
                            } else if (bwr0Var instanceof ewr0) {
                                dks0Var.d(new oon0("albums_add", null, false, false, 14), new buz(12, new bsf("albums_add", 3), c6s0Var.a(bwr0Var)));
                            } else if (bwr0Var instanceof hwr0) {
                                dks0Var.d(new oon0("albums_remove", null, false, false, 14), new buz(12, new bsf("albums_remove", 3), c6s0Var.a(bwr0Var)));
                            } else if (bwr0Var instanceof ayr0) {
                                dks0Var.c(new t8f0(new fxi0(i5), false));
                            } else if (bwr0Var instanceof fyr0) {
                                VideoFile videoFile2 = ((fyr0) bwr0Var).a;
                                dks0Var.c(new buz(12, videoFile2 == null ? new yjs0(0) : new bks0(dks0Var, videoFile2, str3, c3 == true ? 1 : 0), c6s0Var.a(bwr0Var)));
                            } else if (bwr0Var instanceof oxr0) {
                                dks0Var.c(new buz(12, new mdm0(((oxr0) bwr0Var).a(), 16), c6s0Var.a(bwr0Var)));
                            } else if (bwr0Var instanceof qxr0) {
                                dks0Var.c(new buz(12, new zjs0(objArr == true ? 1 : 0, ((qxr0) bwr0Var).a()), c6s0Var.a(bwr0Var)));
                            } else if (bwr0Var instanceof fxr0) {
                                ((fxr0) bwr0Var).getClass();
                                dks0Var.c(new buz(12, new wpl0(objArr2 == true ? 1 : 0, c2 == true ? 1 : 0), c6s0Var.a(bwr0Var)));
                            } else if (bwr0Var instanceof iyr0) {
                                iyr0 iyr0Var = (iyr0) bwr0Var;
                                dks0Var.d(new qon0(4, new l4k0(i4), new vgs0(dks0Var, iyr0Var)), new buz(12, new c2k(dks0Var, iyr0Var.b(), iyr0Var.a(), i4), c6s0Var.a(bwr0Var)));
                            } else if (bwr0Var instanceof ywr0) {
                                dks0Var.c(new buz(12, new wug0(((ywr0) bwr0Var).a(), 26), c6s0Var.a(bwr0Var)));
                            } else if (bwr0Var instanceof uwr0) {
                                dks0Var.c(new buz(12, new ozr(((uwr0) bwr0Var).a(), c == true ? 1 : 0), c6s0Var.a(bwr0Var)));
                            } else if (bwr0Var instanceof qwr0) {
                                dks0Var.c(new oon0("short_video_drafts_list_reload", null, false, false, 14));
                            }
                        }
                    }
                }
                break;
        }
        return s3q0.a;
    }
}
