package xsna;

import android.animation.AnimatorSet;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.ecomm.products_multipicker.api.model.MultipickerProduct;
import com.vk.ecomm.products_multipicker.api.model.MultipickerProductId;
import com.vk.photo.editor.markup.view.tools.button.FontButton;
import com.vk.photo.editor.markup.view.tools.utils.Anchor;
import com.vk.stories.design.view.stickers.StickersDrawingViewGroup;
import com.vk.upload.impl.UploadNotification;
import java.util.ArrayList;
import java.util.List;
import xsna.eqr0;
import xsna.o0x0;
import xsna.vfv;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class y5m0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ y5m0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01e2  */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        ArrayList arrayList;
        String n;
        MultipickerProduct.Rating rating;
        Float f;
        String a;
        ImageSize Ab;
        int i = this.b;
        vfv.a aVar = null;
        r5 = null;
        r5 = null;
        String str = null;
        aVar = null;
        aVar = null;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                z5m0 z5m0Var = (z5m0) obj3;
                no6 no6Var = (no6) obj2;
                MultipickerProduct multipickerProduct = (MultipickerProduct) j5g.a0((List) obj);
                u76 u76Var = z5m0Var.d;
                if (multipickerProduct == null && no6Var == null) {
                    u76Var.i4();
                } else if (multipickerProduct != null) {
                    String str2 = multipickerProduct.c;
                    MultipickerProduct.Moderation moderation = multipickerProduct.e;
                    StickersDrawingViewGroup stickersDrawingViewGroup = z5m0Var.b;
                    ysd0 ysd0Var = z5m0Var.g;
                    if (ysd0Var != null) {
                        ysd0Var.hide();
                    }
                    z5m0Var.g = null;
                    MultipickerProductId multipickerProductId = multipickerProduct.b;
                    Image image = multipickerProduct.f;
                    if (moderation.b) {
                        if (image != null && (arrayList = image.b) != null) {
                            n = ixj0.n(arrayList);
                            Long valueOf = Long.valueOf(multipickerProductId.b);
                            UserId userId = multipickerProductId.c;
                            String str3 = multipickerProduct.i;
                            MultipickerProduct.Owner owner = multipickerProduct.k;
                            if (owner == null) {
                            }
                            rating = multipickerProduct.l;
                            if (rating != null) {
                            }
                            a6m0 a6m0Var = new a6m0(str2, valueOf, userId, str3, "", n, new vfv(str2, r13, n, aVar, moderation.b));
                            if (no6Var != null) {
                            }
                            u76Var.o5().e();
                            z5m0Var.c.f();
                        }
                        n = null;
                        Long valueOf2 = Long.valueOf(multipickerProductId.b);
                        UserId userId2 = multipickerProductId.c;
                        String str32 = multipickerProduct.i;
                        MultipickerProduct.Owner owner2 = multipickerProduct.k;
                        if (owner2 == null) {
                        }
                        rating = multipickerProduct.l;
                        if (rating != null) {
                        }
                        a6m0 a6m0Var2 = new a6m0(str2, valueOf2, userId2, str32, "", n, new vfv(str2, r13, n, aVar, moderation.b));
                        if (no6Var != null) {
                        }
                        u76Var.o5().e();
                        z5m0Var.c.f();
                    } else {
                        if (image != null && (Ab = image.Ab(iah0.a(48), false)) != null) {
                            n = Ab.d.d;
                            Long valueOf22 = Long.valueOf(multipickerProductId.b);
                            UserId userId22 = multipickerProductId.c;
                            String str322 = multipickerProduct.i;
                            MultipickerProduct.Owner owner22 = multipickerProduct.k;
                            String str4 = owner22 == null ? owner22.c : null;
                            rating = multipickerProduct.l;
                            if (rating != null && (f = rating.b) != null) {
                                if (f.floatValue() <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                    f = null;
                                }
                                if (f != null) {
                                    float floatValue = f.floatValue();
                                    Integer num = rating.c;
                                    boolean z = (num != null ? num.intValue() : 0) > 0;
                                    String str5 = rating.d;
                                    if (str5 != null && (a = cqm0.a(str5)) != null && z) {
                                        str = a;
                                    }
                                    aVar = new vfv.a(floatValue, str);
                                }
                            }
                            a6m0 a6m0Var22 = new a6m0(str2, valueOf22, userId22, str322, "", n, new vfv(str2, str4, n, aVar, moderation.b));
                            if (no6Var != null) {
                                stickersDrawingViewGroup.f(new b6m0(z5m0Var.a, a6m0Var22));
                            } else {
                                no6Var.update(a6m0Var22);
                                stickersDrawingViewGroup.invalidate();
                            }
                            u76Var.o5().e();
                            z5m0Var.c.f();
                        }
                        n = null;
                        Long valueOf222 = Long.valueOf(multipickerProductId.b);
                        UserId userId222 = multipickerProductId.c;
                        String str3222 = multipickerProduct.i;
                        MultipickerProduct.Owner owner222 = multipickerProduct.k;
                        if (owner222 == null) {
                        }
                        rating = multipickerProduct.l;
                        if (rating != null) {
                            if (f.floatValue() <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            }
                            if (f != null) {
                            }
                        }
                        a6m0 a6m0Var222 = new a6m0(str2, valueOf222, userId222, str3222, "", n, new vfv(str2, str4, n, aVar, moderation.b));
                        if (no6Var != null) {
                        }
                        u76Var.o5().e();
                        z5m0Var.c.f();
                    }
                }
                break;
            case 1:
                ((dfm0) obj3).b.h((hyg0) obj, (ffm0) obj2);
                break;
            case 2:
                break;
            case 3:
                wdn0 wdn0Var = (wdn0) obj3;
                xdn0 xdn0Var = (xdn0) obj2;
                wdn0Var.p.b(wdn0Var.itemView.getContext(), xdn0Var.e.o.c, xdn0Var, null);
                break;
            case 4:
                ffo0 ffo0Var = (ffo0) obj3;
                FrameLayout frameLayout = (FrameLayout) obj2;
                gzs gzsVar = (gzs) obj;
                AnimatorSet animatorSet = new AnimatorSet();
                ViewGroup viewGroup = ffo0Var.k;
                if (viewGroup == null) {
                    viewGroup = null;
                }
                RecyclerView recyclerView = ffo0Var.n;
                RecyclerView recyclerView2 = recyclerView == null ? null : recyclerView;
                if (recyclerView == null) {
                    recyclerView = null;
                }
                AnimatorSet a2 = lkf0.a(viewGroup, recyclerView2, recyclerView.getWidth(), frameLayout, Anchor.Start);
                ViewGroup viewGroup2 = ffo0Var.m;
                if (viewGroup2 == null) {
                    viewGroup2 = null;
                }
                RecyclerView recyclerView3 = ffo0Var.o;
                RecyclerView recyclerView4 = recyclerView3 == null ? null : recyclerView3;
                if (recyclerView3 == null) {
                    recyclerView3 = null;
                }
                float width = recyclerView3.getWidth();
                FontButton fontButton = ffo0Var.p;
                animatorSet.playTogether(a2, lkf0.b(viewGroup2, recyclerView4, width, fontButton != null ? fontButton : null, Anchor.End));
                animatorSet.addListener(new cfo0(gzsVar));
                animatorSet.start();
                break;
            case 5:
                fgp0 fgp0Var = (fgp0) obj2;
                List<String> list = (List) obj;
                a630 a630Var = ((xfp0) obj3).h;
                Context context = e43.a;
                a630Var.W(context != null ? context : null, fgp0Var.b, true, list);
                break;
            case 6:
                eqr0 eqr0Var = (eqr0) obj3;
                io.reactivex.rxjava3.core.r rVar = (io.reactivex.rxjava3.core.r) obj2;
                UploadNotification.b bVar = (UploadNotification.b) obj;
                e9i0 e9i0Var = new e9i0(rVar, 19);
                u5p0 u5p0Var = new u5p0(rVar, 6);
                int i2 = eqr0.a.$EnumSwitchMapping$0[bVar.b.ordinal()];
                if (i2 == 1) {
                    eqr0Var.e = null;
                    u5p0Var.invoke(bVar.f);
                } else if (i2 == 2) {
                    eqr0Var.e = null;
                    try {
                        Photo photo = (Photo) bVar.e;
                        StringBuilder sb = new StringBuilder();
                        sb.append(photo.e);
                        sb.append('_');
                        sb.append(photo.c);
                        eqr0Var.d = sb.toString();
                        UserId userId3 = photo.e;
                        int i3 = photo.c;
                        tfx tfxVar = new tfx("photos.verticalize", new yu50(4), new nr(25));
                        tfx.n(tfxVar, "owner_id", userId3, 0L, 0L, 12);
                        tfx.l(tfxVar, "photo_id", i3, 0, 0, 8);
                        int i4 = 27;
                        eqr0Var.f = rsg0.T(yfb.x(tfxVar)).subscribe(new a960(new n15(eqr0Var, e9i0Var, u5p0Var, 10), i4), new n240(new lyl0(u5p0Var, 9), i4));
                    } catch (Throwable th) {
                        u5p0Var.invoke(th);
                    }
                }
                break;
            default:
                ((j0x0) obj3).U((s6x0) obj, (o0x0.d) obj2);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ y5m0(dym0 dym0Var, SdkVideoFile sdkVideoFile, UserId userId) {
        this.b = 2;
        this.c = sdkVideoFile;
        this.d = userId;
    }
}
