package xsna;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.text.SpannableStringBuilder;
import android.util.Size;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.groups.dto.GroupsGetByIdObjectResponseDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.clips.attachments.impl.views.video.ClipsVideoAttachmentPickerFragment;
import com.vk.clips.uploader.api.model.ClipUploadJob;
import com.vk.contacts.AndroidContact;
import com.vk.core.apps.BuildInfo;
import com.vk.core.serialize.Serializer;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.common.VerifyInfo;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.CommunityReviewsFragment;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.view.CommunityReviewsView;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.account.AccountInfo;
import com.vk.im.engine.models.dialogs.FolderType;
import com.vk.im.ui.views.settings.EditTextSettingsView;
import com.vk.log.L;
import com.vk.newsfeed.impl.fave_feed.presentation.fragment.FaveFeedFragment;
import com.vk.writebar.WriteBar;
import com.vkontakte.android.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.cxl;
import xsna.ded;
import xsna.drz;
import xsna.h7u0;
import xsna.h8n;
import xsna.ikv0;
import xsna.ktt;
import xsna.mwm;
import xsna.p9k;
import xsna.u2s;
import xsna.vyh;
import xsna.xaf;
import xsna.y7j;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class n6f implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n6f(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00df A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d2  */
    /* JADX WARN: Type inference failed for: r0v55, types: [android.view.KeyEvent$Callback, android.view.View, com.vk.im.ui.views.settings.EditTextSettingsView, com.vk.im.ui.views.settings.LabelSettingsView] */
    /* JADX WARN: Type inference failed for: r11v126, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v27, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v16 */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Context context;
        Context context2;
        VerifyInfo verifyInfo;
        boolean o;
        int i = 14;
        int i2 = 23;
        int i3 = 29;
        androidx.appcompat.app.d dVar = null;
        r5 = null;
        String message = null;
        int i4 = 0;
        switch (this.b) {
            case 0:
                o6f o6fVar = (o6f) this.c;
                Throwable th = (Throwable) obj;
                o6fVar.e.e = 0L;
                o6fVar.j7();
                h03.b(th);
                L.g("ClipsTemplateEditorCropperActionsHandlerImpl", th);
                return s3q0.a;
            case 1:
                return ((i8f) this.c).e.b((z7f) obj);
            case 2:
                ClipsVideoAttachmentPickerFragment.b bVar = (ClipsVideoAttachmentPickerFragment.b) this.c;
                int i5 = ClipsVideoAttachmentPickerFragment.W;
                bVar.d.setText((String) obj);
                return s3q0.a;
            case 3:
                gzs gzsVar = (gzs) this.c;
                ((Integer) obj).intValue();
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 4:
                dgh dghVar = (dgh) this.c;
                for (Pair pair : (List) obj) {
                    ded dedVar = (ded) pair.j();
                    if (dedVar instanceof ded.c) {
                        Integer num = ((ClipUploadJob) pair.i()).f;
                        if (num != null && num.intValue() == 0) {
                            dghVar.K(xaf.f.a);
                        }
                    } else if (dedVar instanceof ded.h) {
                        Integer num2 = ((ClipUploadJob) pair.i()).f;
                        if (num2 != null && num2.intValue() == 0) {
                            dghVar.K(xaf.f.a);
                        } else {
                            dghVar.K(xaf.e.a);
                        }
                    }
                }
                return s3q0.a;
            case 5:
                CommunityReviewsFragment communityReviewsFragment = (CommunityReviewsFragment) this.c;
                vyh vyhVar = (vyh) obj;
                int i6 = CommunityReviewsFragment.o0;
                if (vyhVar instanceof vyh.a) {
                    vyh.a aVar = (vyh.a) vyhVar;
                    if (aVar.a.length() == 0) {
                        return s3q0.a;
                    }
                    Context mo2getContext = communityReviewsFragment.mo2getContext();
                    Object systemService = mo2getContext != null ? mo2getContext.getSystemService("clipboard") : null;
                    String str = aVar.a;
                    ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(str, str));
                } else if (vyhVar instanceof vyh.f) {
                    cvk.w(((vyh.f) vyhVar).a.a(communityReviewsFragment.requireContext()), false);
                } else if (vyhVar instanceof vyh.e) {
                    Context requireContext = communityReviewsFragment.requireContext();
                    ikv0.a aVar2 = new ikv0.a(requireContext);
                    aVar2.t = new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_on_24, Integer.valueOf(R.attr.vk_ui_text_accent), (Size) null, 12);
                    aVar2.u = new ikv0.d(new ikv0.d.c(requireContext.getString(R.string.reviews_successfully_published_review), 2), (ikv0.d.b) null, (ikv0.d.a) null, 6);
                    aVar2.n();
                } else if (vyhVar instanceof vyh.b) {
                    List<efk0> list = ((vyh.b) vyhVar).a;
                    djg0 djg0Var = communityReviewsFragment.X;
                    djg0Var.setItems(list);
                    View findViewById = communityReviewsFragment.requireView().findViewById(R.id.filter_cl);
                    int l = krv0.l(R.attr.vk_ui_icon_accent);
                    findViewById.getContext();
                    e.b bVar2 = new e.b(findViewById, null, null, l, 6);
                    bVar2.w = R.layout.ds_internal_context_menu_item;
                    bVar2.l = djg0Var;
                    bVar2.m = cn70.b(14);
                    VkContextMenu a = bVar2.a();
                    communityReviewsFragment.W = a;
                    a.g();
                } else if (vyhVar instanceof vyh.d) {
                    WriteBar writeBar = communityReviewsFragment.g0;
                    if (writeBar != null) {
                        writeBar.setText(((vyh.d) vyhVar).a);
                    }
                    e2g0 e2g0Var = communityReviewsFragment.S;
                    if (e2g0Var != null) {
                        e2g0Var.j(((vyh.d) vyhVar).b);
                    }
                } else {
                    if (!(vyhVar instanceof vyh.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    vyh.c cVar = (vyh.c) vyhVar;
                    Integer num3 = cVar.a;
                    boolean z = cVar.b;
                    if (num3 != null) {
                        int intValue = num3.intValue();
                        if (cVar.c) {
                            mfy mfyVar = communityReviewsFragment.i0;
                            WriteBar writeBar2 = communityReviewsFragment.g0;
                            EditText input = writeBar2 != null ? writeBar2.getInput() : null;
                            mfyVar.getClass();
                            CommunityReviewsView communityReviewsView = communityReviewsFragment.a0;
                            if (communityReviewsView != null) {
                                communityReviewsView.d(intValue, z);
                            }
                            s3q0 s3q0Var = s3q0.a;
                            if (!mfyVar.a && input != null) {
                                input.post(new rc4(input, 8));
                            }
                        } else {
                            CommunityReviewsView communityReviewsView2 = communityReviewsFragment.a0;
                            if (communityReviewsView2 != null) {
                                communityReviewsView2.d(intValue, z);
                            }
                        }
                    }
                }
                return s3q0.a;
            case 6:
                y7j y7jVar = (y7j) this.c;
                y7jVar.m.onClick((View) obj);
                y7j.a.q6(y7jVar, false);
                return s3q0.a;
            case 7:
                paj pajVar = (paj) this.c;
                i8j i8jVar = pajVar.l;
                t8j t8jVar = pajVar.B;
                i8jVar.w(t8jVar != null ? t8jVar : null, true);
                return s3q0.a;
            case 8:
                ptj ptjVar = (ptj) this.c;
                Throwable th2 = (Throwable) obj;
                if (th2 instanceof VKApiExecutionException) {
                    VKApiExecutionException vKApiExecutionException = (VKApiExecutionException) th2;
                    int s = vKApiExecutionException.s();
                    int i7 = s != 3101 ? s != 3102 ? -1 : R.string.posting_source_incorrect : R.string.posting_source_error_external_links;
                    if (i7 != -1) {
                        TextView textView = ptjVar.d;
                        cvk.w((textView == null || (context2 = textView.getContext()) == null) ? null : context2.getString(i7), false);
                    } else {
                        cvk.w(vKApiExecutionException.u(), false);
                    }
                    if (i7 != -1) {
                        TextView textView2 = ptjVar.d;
                        if (textView2 != null && (context = textView2.getContext()) != null) {
                            message = context.getString(i7);
                        }
                    } else {
                        message = vKApiExecutionException.getMessage();
                    }
                    cvk.w(message, false);
                }
                return s3q0.a;
            case 9:
                AndroidContact androidContact = (AndroidContact) this.c;
                Long l2 = (Long) ((it80) obj).a;
                if (l2 != null) {
                    long longValue = l2.longValue();
                    Object c3500b = longValue == -1000 ? p9k.b.a.a : new p9k.b.C3500b(longValue);
                    if (c3500b != null) {
                        return c3500b;
                    }
                }
                return new p9k.b.c(androidContact);
            case 10:
                ((io.reactivex.rxjava3.disposables.b) ((pfl) this.c).d).b((io.reactivex.rxjava3.disposables.c) obj);
                return s3q0.a;
            case 11:
                ((mxl) this.c).a.invoke(cxl.k.a.b);
                return s3q0.a;
            case 12:
                fum fumVar = (fum) this.c;
                ((Boolean) obj).booleanValue();
                fumVar.T();
                return s3q0.a;
            case 13:
                b25 b25Var = ((mwm) this.c).a;
                AccountInfo accountInfo = (AccountInfo) ((xpp) obj).a();
                if (accountInfo == null || !o25.b(b25Var)) {
                    return mwm.a.c.a;
                }
                return new mwm.a.C3376a(o25.b(b25Var) && (verifyInfo = accountInfo.L) != null && verifyInfo.b);
            case 14:
                h8n.b bVar3 = (h8n.b) this.c;
                h8n.b.a(bVar3, new bu1(h8n.this, i3));
                return s3q0.a;
            case 15:
                ((enh) this.c).invoke();
                return s3q0.a;
            case 16:
                xlb0 xlb0Var = (xlb0) obj;
                ((wzs) this.c).invoke(xlb0Var, new ov70(fdi.E(xlb0Var, false)));
                xlb0Var.a();
                return s3q0.a;
            case 17:
                kzo kzoVar = (kzo) this.c;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                bwt0.p0(kzoVar.e, !booleanValue);
                bwt0.p0(kzoVar.f, booleanValue);
                return s3q0.a;
            case 18:
                final ?? r0 = (EditTextSettingsView) this.c;
                int i8 = EditTextSettingsView.C;
                final EditText editText = new EditText(r0.getContext());
                editText.setText(r0.getSubtitle().toString());
                editText.setSelection(r0.getSubtitle().length());
                int i9 = r0.z;
                qcy<Object>[] qcyVarArr = bwt0.a;
                editText.setTextAppearance(i9);
                editText.setBackground(r0.A);
                FrameLayout frameLayout = new FrameLayout(r0.getContext());
                int i10 = r0.y;
                frameLayout.setPaddingRelative(i10, 0, i10, 0);
                frameLayout.addView(editText);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(r0.getTitle());
                spannableStringBuilder.setSpan(new m7s(R.attr.vk_ui_text_primary), 0, r0.getTitle().length(), 18);
                r0.setTitle(spannableStringBuilder);
                h7u0.a aVar3 = new h7u0.a(r0.getContext());
                aVar3.h0(r0.getTitle());
                aVar3.f = frameLayout;
                aVar3.c0(R.string.vkim_ok, new DialogInterface.OnClickListener() { // from class: xsna.u1p
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i11) {
                        EditTextSettingsView.P4(EditTextSettingsView.this, editText);
                    }
                });
                aVar3.W(R.string.vkim_cancel, new v1p(r0, i4));
                androidx.appcompat.app.d m = aVar3.m();
                if (m != null) {
                    m.show();
                    dVar = m;
                }
                r0.B = dVar;
                return s3q0.a;
            case 19:
                z6p z6pVar = (z6p) this.c;
                qtd0 Cb = ((ProfilesInfo) obj).Cb(Long.valueOf(z6pVar.i));
                if (Cb != null) {
                    return io.reactivex.rxjava3.core.q.T(Cb);
                }
                long j = z6pVar.i;
                Serializer.c<Peer> cVar2 = Peer.CREATOR;
                Peer b = Peer.a.b(j);
                a1w a1wVar = q1w.a;
                return new io.reactivex.rxjava3.internal.jdk8.b((a1wVar != null ? a1wVar : null).C(z6pVar, new b1r0(b, Source.ACTUAL, 12)), new rf1(new n3i(z6pVar, i), i2)).n(io.reactivex.rxjava3.schedulers.a.b()).r();
            case 20:
                return Boolean.valueOf(epx.f(((u1c0) obj).a, (NewsEntry) this.c));
            case 21:
                g2q g2qVar = (g2q) this.c;
                jr20 jr20Var = g2qVar.p;
                Object obj2 = g2qVar.l;
                jr20Var.e2(((bjf0) (obj2 != null ? obj2 : null)).a.getType());
                return s3q0.a;
            case 22:
                ((View) obj).setOnClickListener(new ybq((zbq) this.c, i4));
                return s3q0.a;
            case 23:
                FaveFeedFragment faveFeedFragment = (FaveFeedFragment) this.c;
                com.vk.mvi.binder.c cVar3 = (com.vk.mvi.binder.c) obj;
                qcy<Object>[] qcyVarArr2 = FaveFeedFragment.s0;
                com.vk.mvi.binder.c.a(cVar3, f9t.w(faveFeedFragment.io()), new toq((eoq) faveFeedFragment.m0.getValue()));
                com.vk.mvi.binder.c.b(cVar3, f9t.F(f9t.z(faveFeedFragment.io()), new ol(i2)), new c8(faveFeedFragment, 13));
                return s3q0.a;
            case 24:
                p0s p0sVar = (p0s) this.c;
                xpp xppVar = (xpp) obj;
                io.reactivex.rxjava3.core.w wVar = p0sVar.e;
                if (xppVar.a && p0sVar.f.compareAndSet(false, true)) {
                    p0sVar.g.b(io.reactivex.rxjava3.kotlin.c.e(p0sVar.a.C(p0sVar, new cqm(Source.NETWORK)).q(wVar).m(wVar), new zqh(p0sVar, 16), new i4e(p0sVar, i3)));
                }
                p0sVar.d.onNext(xppVar.a());
                return s3q0.a;
            case 25:
                i2s i2sVar = (i2s) this.c;
                drz.a aVar4 = (drz.a) obj;
                Map map = (Map) aVar4.a;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    rpm rpmVar = (rpm) entry.getValue();
                    cau0 cau0Var = i2sVar.l;
                    FolderType folderType = rpmVar.c;
                    switch (u2s.a.$EnumSwitchMapping$0[folderType.ordinal()]) {
                        case 1:
                        case 4:
                            o = true;
                            if (((!o || folderType == FolderType.CHANNELS || folderType == FolderType.MANAGED_GROUPS) ? false : true) == false) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                            break;
                        case 2:
                            o = cau0Var.o();
                            if (!o) {
                                if (((!o || folderType == FolderType.CHANNELS || folderType == FolderType.MANAGED_GROUPS) ? false : true) == false) {
                                }
                                break;
                            }
                            if (((!o || folderType == FolderType.CHANNELS || folderType == FolderType.MANAGED_GROUPS) ? false : true) == false) {
                            }
                            break;
                        case 3:
                            if (!BuildInfo.s()) {
                                cau0Var.getClass();
                            }
                            o = true;
                            if (((!o || folderType == FolderType.CHANNELS || folderType == FolderType.MANAGED_GROUPS) ? false : true) == false) {
                            }
                            break;
                        case 5:
                            o = BuildInfo.s();
                            if (((!o || folderType == FolderType.CHANNELS || folderType == FolderType.MANAGED_GROUPS) ? false : true) == false) {
                            }
                            break;
                        case 6:
                        case 7:
                            o = false;
                            if (((!o || folderType == FolderType.CHANNELS || folderType == FolderType.MANAGED_GROUPS) ? false : true) == false) {
                            }
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                }
                return drz.a.a(aVar4, linkedHashMap);
            case 26:
                fxt0 fxt0Var = (fxt0) this.c;
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((zak0) fxt0Var.a).setValue(bool);
                return s3q0.a;
            case 27:
                return ((kr5) this.c).b(((Integer) obj).intValue());
            case 28:
                ((jba0) this.c).b();
                return s3q0.a;
            default:
                ktt.a aVar5 = (ktt.a) this.c;
                GroupsGetByIdObjectResponseDto groupsGetByIdObjectResponseDto = (GroupsGetByIdObjectResponseDto) obj;
                if (groupsGetByIdObjectResponseDto.d() == null || !(!r1.isEmpty())) {
                    return aVar5;
                }
                BaseBoolIntDto I3 = groupsGetByIdObjectResponseDto.d().get(0).I3();
                if (I3 != null && I3.i() == 1) {
                    i4 = 1;
                }
                return new ktt.a(aVar5.a, aVar5.b, (boolean) (i4 ^ 1), aVar5.d);
        }
    }

    public /* synthetic */ n6f(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }
}
