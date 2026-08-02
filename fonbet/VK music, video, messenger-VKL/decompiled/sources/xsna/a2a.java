package xsna;

import android.app.Dialog;
import android.os.Bundle;
import android.util.Size;
import android.view.Window;
import android.webkit.WebView;
import com.vk.api.generated.catalog.dto.CatalogEntityGroupsItemDto;
import com.vk.api.generated.catalog.dto.CatalogGroupsItemDto;
import com.vk.core.view.components.picture.c;
import com.vk.core.widget.LifecycleHandler;
import com.vk.dto.common.Peer;
import com.vk.dto.group.GroupsEntityCatalogItem;
import com.vk.dto.user.VisibleStatus;
import com.vk.im.engine.models.InfoBar;
import com.vk.im.engine.models.contacts.Contact;
import com.vk.im.ui.views.InfoBarView;
import com.vk.log.L;
import com.vk.newsfeed.api.data.NewsComment;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.browser.utils.VkUiUploadFailureType;
import com.vk.superapp.core.errors.VkAppsErrors;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.json.JSONObject;
import ru.ok.android.utils.Logger;
import xsna.a3y;
import xsna.bex0;
import xsna.brx;
import xsna.ikv0;
import xsna.owg;
import xsna.pgw0;
import xsna.tlo0;
import xsna.xn50;
import xsna.yqx;

/* compiled from: CatalogBlockMapper.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class a2a extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a2a(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
    
        if (((com.vk.im.engine.models.contacts.Contact) r1).m == com.vk.im.engine.models.contacts.Contact.LastSeenStatus.LONG_AGO) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007a, code lost:
    
        r2.T(new xsna.pgw0.i(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0078, code lost:
    
        if (r3.b < (xsna.qni0.a() - java.util.concurrent.TimeUnit.DAYS.toMillis(60))) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0113, code lost:
    
        if (r9.contains(new kotlin.Pair(java.lang.Long.valueOf(r1.a), r7)) == false) goto L49;
     */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Dialog dialog;
        Window window;
        Window window2;
        VkAppsErrors.Client client;
        String str = null;
        int i = 0;
        switch (this.b) {
            case 0:
                CatalogEntityGroupsItemDto catalogEntityGroupsItemDto = (CatalogEntityGroupsItemDto) obj;
                ((hpu) this.receiver).getClass();
                String id = catalogEntityGroupsItemDto.getId();
                if (id == null) {
                    id = "";
                }
                List<CatalogGroupsItemDto> d = catalogEntityGroupsItemDto.d();
                if (d == null) {
                    d = EmptyList.b;
                }
                List<CatalogGroupsItemDto> list = d;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(x1o0.o((CatalogGroupsItemDto) it.next()));
                }
                return new GroupsEntityCatalogItem(id, arrayList);
            case 1:
                rmf rmfVar = (rmf) obj;
                ((pmf) this.receiver).getClass();
                return Boolean.valueOf(!epx.f(rmfVar.g, rmfVar.f));
            case 2:
                yvg yvgVar = (yvg) this.receiver;
                yvgVar.getClass();
                L.i((Throwable) obj);
                yvgVar.T(new owg.a.C3476a());
                return s3q0.a;
            case 3:
                ((com.vk.metrics.eventtracking.b) this.receiver).a((Throwable) obj);
                return s3q0.a;
            case 4:
                return Boolean.valueOf(((NewsComment) this.receiver).zb((NewsComment) obj));
            case 5:
                xam xamVar = (xam) this.receiver;
                f9w f9wVar = xam.y;
                xamVar.getClass();
                InfoBar infoBar = (InfoBar) ((xpp) obj).a();
                if (infoBar != null) {
                    com.vk.im.engine.models.dialogs.Dialog Cb = xamVar.t.a.Cb();
                    if ((Cb != null ? Cb.zb() : null) == null) {
                        xamVar.t.g = infoBar;
                        zam zamVar = xamVar.u;
                        if (zamVar != null) {
                            zamVar.c();
                            InfoBarView infoBarView = zamVar.c;
                            infoBarView.setVisibility(0);
                            infoBarView.setFromBar(infoBar);
                        }
                        xamVar.a1(infoBar);
                    }
                }
                return s3q0.a;
            case 6:
                Throwable th = (Throwable) obj;
                mem memVar = (mem) this.receiver;
                sem semVar = memVar.s;
                if (semVar != null) {
                    semVar.c().dismiss();
                }
                if (memVar.s != null) {
                    zk70.e(th);
                }
                return s3q0.a;
            case 7:
                L.i((Throwable) obj);
                return s3q0.a;
            case 8:
                brx brxVar = (brx) obj;
                yqx yqxVar = (yqx) this.receiver;
                yqx.b bVar = yqx.n1;
                if (brxVar instanceof brx.a) {
                    yqxVar.dismiss();
                } else {
                    yqxVar.getClass();
                    if (brxVar instanceof brx.d) {
                        brx.d dVar = (brx.d) brxVar;
                        String str2 = dVar.a;
                        String str3 = dVar.b;
                        Dialog dialog2 = yqxVar.s;
                        if (dialog2 != null && (window2 = dialog2.getWindow()) != null) {
                            ikv0 ikv0Var = yqxVar.m1;
                            if (ikv0Var != null) {
                                ikv0Var.a();
                            }
                            ikv0.a aVar = new ikv0.a(yqxVar.requireContext());
                            aVar.u = new ikv0.d(yqxVar.getString(R.string.invite_friends_invite_revoked), str3, (ikv0.d.a) null, 4);
                            aVar.t = new ikv0.c.a(new c.d(str2, null));
                            aVar.f = yqxVar.getView();
                            aVar.e = 2000L;
                            aVar.o = Integer.valueOf(iah0.a(Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE));
                            ikv0 b = aVar.b();
                            b.b.f(window2);
                            yqxVar.m1 = b;
                        }
                    } else if (brxVar instanceof brx.e) {
                        CharSequence a = tlo0.b.a(hq.b(tlo0.Companion, R.plurals.invite_friends_invites_send_count, ((brx.e) brxVar).a), yqxVar.requireContext());
                        if (a != null) {
                            ikv0 ikv0Var2 = yqxVar.m1;
                            if (ikv0Var2 != null) {
                                ikv0Var2.a();
                            }
                            ikv0.a aVar2 = new ikv0.a(yqxVar.requireContext());
                            aVar2.u = new ikv0.d(a.toString(), (String) null, (ikv0.d.a) null, 6);
                            aVar2.t = new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_outline_28, Integer.valueOf(R.attr.vk_ui_icon_positive), (Size) null, 12);
                            aVar2.e = 2000L;
                            yqxVar.m1 = pkv0.f(aVar2);
                        }
                        yqxVar.getParentFragmentManager().k0(Bundle.EMPTY, "invite_friends_result");
                        yqxVar.dismiss();
                    } else if (brxVar instanceof brx.b) {
                        vtk0.d().d((LifecycleHandler) yqxVar.j1.getValue(), new zqx(yqxVar));
                    } else {
                        if (!(brxVar instanceof brx.c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        CharSequence a2 = ((brx.c) brxVar).a.a(yqxVar.requireContext());
                        if (a2 != null && (dialog = yqxVar.s) != null && (window = dialog.getWindow()) != null) {
                            ikv0 ikv0Var3 = yqxVar.m1;
                            if (ikv0Var3 != null) {
                                ikv0Var3.a();
                            }
                            ikv0.a aVar3 = new ikv0.a(yqxVar.requireContext());
                            aVar3.u = new ikv0.d(a2.toString(), (String) null, (ikv0.d.a) null, 6);
                            aVar3.t = new ikv0.c.C3058c(R.drawable.vk_icon_info_circle_outline_28, Integer.valueOf(R.attr.vk_ui_icon_secondary), (Size) null, 12);
                            aVar3.f = yqxVar.getView();
                            aVar3.o = Integer.valueOf(iah0.a(Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE));
                            aVar3.e = 2000L;
                            ikv0 b2 = aVar3.b();
                            b2.b.f(window);
                            yqxVar.m1 = b2;
                        }
                    }
                }
                return s3q0.a;
            case 9:
                dxv0 dxv0Var = (dxv0) obj;
                long j = dxv0Var.a;
                String str4 = dxv0Var.b;
                a3y a3yVar = (a3y) this.receiver;
                HashSet<Pair<Long, String>> hashSet = a3yVar.d;
                x6y x6yVar = a3yVar.a;
                Map<JsApiMethodType, String> map = x6yVar.g;
                fvv0 M = x6yVar.M();
                if (M != null && j == M.getAppId()) {
                    if (dxv0Var instanceof hvv0) {
                        wn4 wn4Var = ((hvv0) dxv0Var).e;
                        if (wn4Var instanceof pxv0) {
                            if (((pxv0) wn4Var).a == VkUiUploadFailureType.DELETED) {
                                break;
                            }
                        }
                    }
                    return s3q0.a;
                }
                if (dxv0Var.c) {
                    a3yVar.c = false;
                    hashSet.add(new Pair<>(Long.valueOf(j), str4));
                }
                if (dxv0Var.d) {
                    hashSet.remove(new Pair(Long.valueOf(j), str4));
                }
                if (dxv0Var instanceof hvv0) {
                    hvv0 hvv0Var = (hvv0) dxv0Var;
                    String str5 = hvv0Var.b;
                    wn4 wn4Var2 = hvv0Var.e;
                    if (str5.length() != 0) {
                        boolean z = wn4Var2 instanceof bxv0;
                        if (z) {
                            client = VkAppsErrors.Client.INVALID_PARAMS;
                        } else {
                            if (!(wn4Var2 instanceof pxv0)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            int i2 = a3y.a.$EnumSwitchMapping$0[((pxv0) wn4Var2).a.ordinal()];
                            if (i2 == 1) {
                                client = VkAppsErrors.Client.USER_DENIED;
                            } else if (i2 == 2) {
                                client = VkAppsErrors.Client.USER_DENIED;
                            } else {
                                if (i2 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                client = VkAppsErrors.Client.UNKNOWN_ERROR;
                            }
                        }
                        VkAppsErrors.Client client2 = client;
                        if (z) {
                            str = ((bxv0) wn4Var2).toString();
                        } else if (!(wn4Var2 instanceof pxv0)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        bex0.a.a(x6yVar, JsApiMethodType.SHOW_CLIP_BOX, client2, str, null, hvv0Var.b, 32);
                    }
                } else if (dxv0Var instanceof kvv0) {
                    String str6 = ((kvv0) dxv0Var).b;
                    if (str6.length() != 0) {
                        bex0.a.b(x6yVar, JsApiMethodType.SHOW_CLIP_BOX, com.vk.movika.sdk.android.defaultplayer.interactive.c.b("result", true), str6, 8);
                    }
                } else {
                    if (!(dxv0Var instanceof cxv0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cxv0 cxv0Var = (cxv0) dxv0Var;
                    String str7 = cxv0Var.b;
                    if (str7.length() != 0) {
                        JsApiMethodType jsApiMethodType = JsApiMethodType.SHOW_CLIP_BOX;
                        if (!epx.f(map.get(jsApiMethodType), str7)) {
                            x6yVar.u(jsApiMethodType, new JSONObject().put(CommonUrlParts.REQUEST_ID, str7).toString());
                        }
                        String h = cxv0Var.a().h();
                        JSONObject put = new JSONObject().put("clip_id", cxv0Var.e).put("clip_owner_id", cxv0Var.f);
                        xgx0 xgx0Var = xgx0.a;
                        String str8 = "send multiple event: " + jsApiMethodType.i() + ", eventName=" + h + ", jsonData=" + put;
                        xgx0Var.getClass();
                        xgx0.a(str8);
                        String str9 = map.get(jsApiMethodType);
                        if (str9 != null && !drm0.N(str9)) {
                            put.put(CommonUrlParts.REQUEST_ID, str9);
                        }
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("type", h);
                        jSONObject.put("data", put);
                        if (str9 != null && !drm0.N(str9)) {
                            jSONObject.put(CommonUrlParts.REQUEST_ID, str9);
                        }
                        WebView r = x6yVar.r();
                        if (r != null) {
                            r.post(new at6(i, x6yVar, jSONObject));
                        }
                    }
                }
                return s3q0.a;
            case 10:
                com.vk.music.informer.mvi.f fVar = (com.vk.music.informer.mvi.f) this.receiver;
                fVar.getClass();
                xn50.a.c(fVar, (com.vk.music.informer.mvi.e) obj);
                return s3q0.a;
            case 11:
                cs90.f((cs90) this.receiver, (Throwable) obj);
                return s3q0.a;
            case 12:
                ((eck0) this.receiver).o(((Number) obj).intValue());
                return s3q0.a;
            case 13:
                ((com.vk.auth.ui.password.askpassword.a) this.receiver).a((vgg) obj);
                return s3q0.a;
            default:
                qtd0 qtd0Var = (qtd0) obj;
                mgw0 mgw0Var = (mgw0) this.receiver;
                mgw0Var.getClass();
                if (qtd0Var.t8() == Peer.Type.UNKNOWN) {
                    mgw0Var.T(pgw0.g.b);
                } else if (qtd0Var.getId().equals(Long.valueOf(mgw0Var.g.L().b))) {
                    mgw0Var.T(pgw0.a.b);
                } else if (!qtd0Var.ib()) {
                    mgw0Var.T(new pgw0.d(qtd0Var));
                } else if (qtd0Var instanceof Contact) {
                    break;
                } else {
                    VisibleStatus zb = qtd0Var.mb().zb();
                    if (zb != null) {
                        break;
                    }
                    mgw0Var.T(new pgw0.b(qtd0Var));
                }
                return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2a(Object obj, int i) {
        super(1, obj, pmf.class, "isApplyButtonEnabled", "isApplyButtonEnabled(Lcom/vk/clips/attachments/impl/feature/video/ClipsVideoAttachmentState;)Z", 0);
        this.b = i;
        switch (i) {
            case 3:
                super(1, obj, com.vk.metrics.eventtracking.b.class, "logException", "logException(Ljava/lang/Throwable;)V", 0);
                break;
            case 4:
                super(1, obj, NewsComment.class, "containsComment", "containsComment(Lcom/vk/newsfeed/api/data/NewsComment;)Z", 0);
                break;
            case 5:
                super(1, obj, xam.class, "onPushDisableInfoBarGet", "onPushDisableInfoBarGet(Lcom/vk/im/engine/models/EntityValue;)V", 0);
                break;
            case 6:
                super(1, obj, mem.class, "onMsgDeleteError", "onMsgDeleteError(Ljava/lang/Throwable;)V", 0);
                break;
            case 7:
                super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
            case 8:
            case 9:
            case 10:
            case 11:
            default:
                break;
            case 12:
                super(1, obj, eck0.class, "stop", "stop(I)V", 0);
                break;
            case 13:
                super(1, obj, com.vk.auth.ui.password.askpassword.a.class, "handleError", "handleError(Lcom/vk/superapp/core/errors/CommonApiError;)V", 0);
                break;
        }
    }
}
