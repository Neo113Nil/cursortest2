package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.fragment.app.Fragment;
import com.yandex.go.address.models.Address;
import com.yandex.go.summary.navigation.e;
import com.yandex.go.taxi.order.custom_tips_input.mvp.CustomTipsInputModalView;
import com.yandex.messaging.files.ImageFileInfo;
import com.yandex.messaging.ui.folders.CreateEditFolderDialogFragment;
import com.yandex.payment.divkit.bind.view.DKCardNumberInput;
import com.yandex.payment.sdk.core.data.SbpChallengeInfo;
import com.yandex.plus.core.debug.panel.internal.presentation.view.DebugPanelContainer;
import com.yandex.plus.core.debug.panel.internal.presentation.view.DebugPanelGeneralInfoView;
import com.yandex.xplat.common.Encoding;
import com.yandex.xplat.common.FileSystemError;
import com.ybsdk.feature.credit.deposit.api.CreditScreenParams;
import com.ybsdk.feature.credit.deposit.internal.screens.deposit.CreditDepositFragment;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.Future;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.preorder.source.ModalViewOrigin;
import ru.yandex.taxi.requirements.interactor.x;
import ru.yandex.taxi.search.address.view.CompositeAddressSearchView;

/* loaded from: classes5.dex */
public final /* synthetic */ class jhd implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jhd(wwf wwfVar, String str, aye0 aye0Var) {
        this.a = 26;
        this.b = str;
        this.c = aye0Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        tpr createSuggestMenuPayload$lambda$4;
        Object parse;
        Object obj;
        Uri.Builder a;
        zy11 CreateEditFolderDialogRoot$lambda$24$lambda$19$lambda$18;
        View renderPaymentMethodsBottomSheet$lambda$37;
        zy11 zy11Var;
        zy11 showDialog$lambda$4;
        DebugPanelGeneralInfoView infoView_delegate$lambda$1;
        SbpChallengeInfo.SbpChallengeMethod sbpChallengeMethod;
        Long m;
        tyj0 tyj0Var;
        Charset charset;
        String x0;
        Object obj2;
        int i = this.a;
        List list = EmptyList.a;
        int i2 = 10;
        int i3 = 1;
        op60 op60Var = null;
        zy11 zy11Var2 = zy11.a;
        Object obj3 = this.b;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                e eVar = (e) obj4;
                eVar.A((m950) eVar.T.get(), k0b1.a((Address) obj3, ((gh00) eVar.S).e.b(), SourcePicker.ADDITIONAL_FROM_SUMMARY, ModalViewOrigin.SUMMARY, false, new e83(i3, eVar)), sy60.Q2);
                return zy11Var2;
            case 1:
                createSuggestMenuPayload$lambda$4 = CompositeAddressSearchView.createSuggestMenuPayload$lambda$4((CompositeAddressSearchView) obj3, (x9v0) obj4);
                return createSuggestMenuPayload$lambda$4;
            case 2:
                bts btsVar = ((ytd) obj3).a;
                sus0 sus0Var = btsVar.c;
                gu7 gu7Var = new gu7(16, obj4);
                dus0 j = sus0Var.j();
                int i4 = 0;
                while (true) {
                    try {
                        if (i4 < sus0Var.b) {
                            if (j.l(i4) && ((Boolean) gu7Var.invoke(j.n(i4))).booleanValue()) {
                                op60 op60Var2 = new op60(i4, null);
                                j.c();
                                op60Var = op60Var2;
                            } else {
                                int[] iArr = j.b;
                                int i5 = i4 + 1;
                                int d = (i5 < j.c ? iArr[(i5 * 5) + 4] : j.e) - uus0.d(i4, iArr);
                                for (int i6 = 0; i6 < d; i6++) {
                                    if (((Boolean) gu7Var.invoke(j.h(i4, i6))).booleanValue()) {
                                        op60Var = new op60(i4, Integer.valueOf(i6));
                                    }
                                }
                                i4 = i5;
                            }
                        }
                    } finally {
                    }
                }
                if (op60Var != null) {
                    int i7 = op60Var.a;
                    Integer num = op60Var.b;
                    dus0 j2 = sus0Var.j();
                    try {
                        ArrayList h = ipb1.h(j2, i7, num);
                        j2.c();
                        list = a.m0(btsVar.J(), h);
                    } finally {
                    }
                }
                return new zgd(list, btsVar.C);
            case 3:
                ((tls) obj3).invoke(new bvd((fvd) obj4));
                return zy11Var2;
            case 4:
                return new x((g580) ((i3y) ((sk7) obj3).c).getValue(), (ijj0) obj4);
            case 5:
                try {
                    Bitmap a2 = s0z0.a(((hwd) obj3).a, ((ImageFileInfo) obj4).getUri());
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    a2.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    a2.recycle();
                    return byteArrayOutputStream.toByteArray();
                } catch (OutOfMemoryError e) {
                    dac.g("Out of memory while compressing image", e);
                    return null;
                }
            case 6:
                ((bzd) obj4).getClass();
                throw null;
            case 7:
                ((tls) obj3).invoke(((oae) obj4).k);
                return zy11Var2;
            case 8:
                sk7 sk7Var = (sk7) obj3;
                jbq0 jbq0Var = (jbq0) obj4;
                u1n.m((u1n) sk7Var.w, jbq0Var.c);
                boj0.k((boj0) sk7Var.c, jbq0Var.a, jbq0Var.b, null, 8);
                return zy11Var2;
            case 9:
                ((tls) obj3).invoke(Boolean.valueOf(!((yde) obj4).b));
                return zy11Var2;
            case 10:
                ((tls) obj3).invoke(((zfe) obj4).b);
                return zy11Var2;
            case 11:
                ((tls) obj3).invoke(((unb) obj4).h);
                return zy11Var2;
            case 12:
                ((AccessibilityManager) obj3).removeTouchExplorationStateChangeListener((sje) obj4);
                return zy11Var2;
            case 13:
                iti0 iti0Var = (iti0) obj3;
                rme rmeVar = (rme) obj4;
                String str = iti0Var != null ? iti0Var.b : null;
                if (str != null) {
                    try {
                        parse = Uri.parse(str);
                    } catch (Throwable th) {
                        obj = new Result.Failure(th);
                    }
                } else {
                    parse = null;
                }
                obj = parse;
                boolean z = obj instanceof Result.Failure;
                Object obj5 = obj;
                if (z) {
                    obj5 = null;
                }
                Uri uri = (Uri) obj5;
                if (uri != null) {
                    a = Uri.parse(rmeVar.g().a).buildUpon();
                    if (rmeVar.g().p.contains(uri.buildUpon().path(null).query(null).fragment(null).build().toString())) {
                        a.encodedAuthority(uri.getHost());
                    }
                    if (rmeVar.g().n) {
                        a.appendQueryParameter("mode", "fullscreen");
                    }
                } else {
                    a = rmeVar.a();
                }
                rmeVar.j(a, str);
                return a.build();
            case 14:
                rme rmeVar2 = (rme) obj3;
                Uri.Builder a3 = rmeVar2.a();
                Uri parse2 = Uri.parse((String) obj4);
                Iterator<T> it = parse2.getPathSegments().iterator();
                while (it.hasNext()) {
                    a3.appendPath((String) it.next());
                }
                for (String str2 : parse2.getQueryParameterNames()) {
                    a3.appendQueryParameter(str2, parse2.getQueryParameter(str2));
                }
                rmeVar2.k(a3);
                return a3.build();
            case 15:
                Object obj6 = ((Future) obj3).get();
                ((pzt0) obj4).a(null);
                return obj6;
            case 16:
                ((tls) obj3).invoke(((ste) obj4).a());
                return zy11Var2;
            case 17:
                CreateEditFolderDialogRoot$lambda$24$lambda$19$lambda$18 = CreateEditFolderDialogFragment.CreateEditFolderDialogRoot$lambda$24$lambda$19$lambda$18((com.yandex.messaging.ui.folders.e) obj3, (oz40) obj4);
                return CreateEditFolderDialogRoot$lambda$24$lambda$19$lambda$18;
            case 18:
                renderPaymentMethodsBottomSheet$lambda$37 = CreditDepositFragment.renderPaymentMethodsBottomSheet$lambda$37((CreditDepositFragment) obj3, (haf) obj4);
                return renderPaymentMethodsBottomSheet$lambda$37;
            case 19:
                return utb1.c((CreditScreenParams) obj3, (tv3) obj4);
            case 20:
                zy11Var = CustomTipsInputModalView.setupInputField$lambda$0$2((tzx) obj3, (CustomTipsInputModalView) obj4);
                return zy11Var;
            case 21:
                new Handler(Looper.getMainLooper()).post(new j9f(i2, (DKCardNumberInput) obj3, (com.yandex.payment.divkit.bind.view.a) obj4));
                return zy11Var2;
            case 22:
                showDialog$lambda$4 = DebugPanelContainer.showDialog$lambda$4((sls) obj3, (DebugPanelContainer) obj4);
                return showDialog$lambda$4;
            case 23:
                infoView_delegate$lambda$1 = DebugPanelContainer.infoView_delegate$lambda$1((Context) obj3, (DebugPanelContainer) obj4);
                return infoView_delegate$lambda$1;
            case 24:
                ((ryj0) ((sae) obj3).b).onSuccess(new vm0(((anh) obj4).a.toString(), list));
                return zy11Var2;
            case 25:
                wx90 wx90Var = (wx90) obj4;
                ryj0 ryj0Var = (ryj0) ((sae) obj3).b;
                int i8 = vme.c[wx90Var.a.ordinal()];
                if (i8 == 1) {
                    sbpChallengeMethod = SbpChallengeInfo.SbpChallengeMethod.SmsChallenge;
                } else {
                    if (i8 != 2) {
                        w511.b();
                        return null;
                    }
                    sbpChallengeMethod = SbpChallengeInfo.SbpChallengeMethod.RandomAmount;
                }
                SbpChallengeInfo.SbpChallengeMethod sbpChallengeMethod2 = sbpChallengeMethod;
                String str3 = wx90Var.b;
                String str4 = wx90Var.c;
                String str5 = wx90Var.d;
                String str6 = wx90Var.g;
                ryj0Var.onSuccess(new wm0(new SbpChallengeInfo(sbpChallengeMethod2, str3, str4, (str6 == null || (m = bvu0.m(10, str6)) == null) ? (new Date().getTime() / 1000) + 30 : m.longValue(), str5, wx90Var.e, wx90Var.f)));
                return zy11Var2;
            case 26:
                String str7 = (String) obj3;
                File file = new File(str7);
                Encoding encoding = (Encoding) ((aye0) obj4).b;
                try {
                } catch (Throwable th2) {
                    tyj0Var = new tyj0(null, new FileSystemError(oyr.p("Received unexpected error when accessing file item at path: '", str7, "'"), th2));
                }
                if (!file.exists()) {
                    return new tyj0(null, new FileSystemError("File item is missing at path: '" + str7 + "'", null));
                }
                if (file.isDirectory()) {
                    return new tyj0(null, new FileSystemError("File item at path could not be read: '" + str7 + "'", null));
                }
                FileInputStream fileInputStream = new FileInputStream(file);
                if (pbh.a[encoding.ordinal()] == 1) {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream, 8192);
                    try {
                        byte[] R = rzo.R(bufferedInputStream);
                        bufferedInputStream.close();
                        x0 = Base64.encodeToString(R, 2);
                    } finally {
                    }
                } else {
                    int i9 = qbh.a[encoding.ordinal()];
                    if (i9 == 1) {
                        charset = null;
                    } else {
                        if (i9 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        charset = StandardCharsets.UTF_8;
                    }
                    if (charset == null) {
                        charset = StandardCharsets.UTF_8;
                    }
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream, charset), 8192);
                    try {
                        x0 = cma1.x0(bufferedReader);
                        bufferedReader.close();
                    } finally {
                    }
                }
                tyj0Var = new tyj0(x0, null);
                return tyj0Var;
            case 27:
                kr krVar = (kr) obj3;
                gjh gjhVar = (gjh) obj4;
                if (krVar != null) {
                    List f = gjhVar.a.c.f();
                    ListIterator listIterator = f.listIterator(f.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            obj2 = listIterator.previous();
                            if (((Fragment) obj2) instanceof zu) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    zu zuVar = obj2 instanceof zu ? (zu) obj2 : null;
                    if (zuVar != null) {
                        zuVar.dispatchAction(krVar);
                    }
                }
                return zy11Var2;
            case 28:
                ((nkh) obj3).a.a((Uri) obj4);
                return zy11Var2;
            default:
                return new z5w(wwg.V(((aly0) obj3).x((rzx) ((sls) obj4).invoke())));
        }
    }

    public /* synthetic */ jhd(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
