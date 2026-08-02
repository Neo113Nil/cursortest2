package com.yandex.go.data.mappers;

import com.yandex.go.data.entities.network.UserPhotoActionTypeDto;
import com.yandex.go.data.entities.network.UserPhotoButtonDto;
import com.yandex.go.data.entities.network.UserPhotoStateResponse;
import com.yandex.go.domain.entities.UserPhotoButtonAction;
import defpackage.aq21;
import defpackage.bdc;
import defpackage.bq21;
import defpackage.gq21;
import defpackage.jq21;
import defpackage.ny61;
import defpackage.pdc;
import defpackage.scc;
import defpackage.tcc;
import defpackage.ufu;
import defpackage.w511;
import defpackage.xq21;
import java.util.ArrayList;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.c;

/* loaded from: classes12.dex */
public final class a {
    public final bq21 a;
    public final c b;

    public a(bq21 bq21Var, c cVar) {
        this.a = bq21Var;
        this.b = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(UserPhotoStateResponse userPhotoStateResponse, ContinuationImpl continuationImpl) {
        UserPhotoUploadingInfoMapper$mapModel$1 userPhotoUploadingInfoMapper$mapModel$1;
        int i;
        String str;
        String str2;
        String str3;
        CharSequence charSequence;
        FormattedText formattedText;
        UserPhotoStateResponse userPhotoStateResponse2;
        CharSequence charSequence2;
        CharSequence charSequence3;
        FormattedText formattedText2;
        CharSequence charSequence4;
        CharSequence charSequence5;
        UserPhotoStateResponse userPhotoStateResponse3;
        String str4;
        CharSequence charSequence6;
        String str5;
        UserPhotoButtonAction userPhotoButtonAction;
        UserPhotoStateResponse userPhotoStateResponse4 = userPhotoStateResponse;
        if (continuationImpl instanceof UserPhotoUploadingInfoMapper$mapModel$1) {
            userPhotoUploadingInfoMapper$mapModel$1 = (UserPhotoUploadingInfoMapper$mapModel$1) continuationImpl;
            int i2 = userPhotoUploadingInfoMapper$mapModel$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                userPhotoUploadingInfoMapper$mapModel$1.label = i2 - Integer.MIN_VALUE;
                Object obj = userPhotoUploadingInfoMapper$mapModel$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = userPhotoUploadingInfoMapper$mapModel$1.label;
                c cVar = this.b;
                int i3 = 3;
                int i4 = 2;
                Throwable th = null;
                int i5 = 1;
                if (i != 0) {
                    b.b(obj);
                    jq21 jq21Var = userPhotoStateResponse4.d;
                    String str6 = jq21Var.b;
                    String str7 = jq21Var.c;
                    FormattedText formattedText3 = userPhotoStateResponse4.a;
                    userPhotoUploadingInfoMapper$mapModel$1.L$0 = userPhotoStateResponse4;
                    userPhotoUploadingInfoMapper$mapModel$1.L$1 = str6;
                    userPhotoUploadingInfoMapper$mapModel$1.L$2 = str7;
                    userPhotoUploadingInfoMapper$mapModel$1.label = 1;
                    Object i6 = c.i(cVar, formattedText3, null, userPhotoUploadingInfoMapper$mapModel$1, 30);
                    if (i6 != coroutineSingletons) {
                        str = str6;
                        str2 = str7;
                        obj = i6;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i == 2) {
                        charSequence3 = (CharSequence) userPhotoUploadingInfoMapper$mapModel$1.L$4;
                        str2 = (String) userPhotoUploadingInfoMapper$mapModel$1.L$3;
                        str3 = (String) userPhotoUploadingInfoMapper$mapModel$1.L$2;
                        userPhotoStateResponse2 = (UserPhotoStateResponse) userPhotoUploadingInfoMapper$mapModel$1.L$0;
                        b.b(obj);
                        CharSequence charSequence7 = (CharSequence) obj;
                        charSequence = charSequence3;
                        charSequence2 = charSequence7;
                        formattedText2 = userPhotoStateResponse2.c;
                        if (formattedText2 == null) {
                            charSequence4 = charSequence;
                            charSequence5 = null;
                            userPhotoStateResponse3 = userPhotoStateResponse2;
                            str4 = str3;
                            CharSequence charSequence8 = charSequence2;
                            String str8 = str2;
                            List list = userPhotoStateResponse3.e;
                            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                            int i7 = 0;
                            while (r1.hasNext()) {
                            }
                            return new xq21(str4, str8, charSequence4, charSequence8, charSequence5, arrayList);
                        }
                        userPhotoUploadingInfoMapper$mapModel$1.L$0 = userPhotoStateResponse2;
                        userPhotoUploadingInfoMapper$mapModel$1.L$1 = null;
                        userPhotoUploadingInfoMapper$mapModel$1.L$2 = str3;
                        userPhotoUploadingInfoMapper$mapModel$1.L$3 = str2;
                        userPhotoUploadingInfoMapper$mapModel$1.L$4 = charSequence;
                        userPhotoUploadingInfoMapper$mapModel$1.L$5 = charSequence2;
                        userPhotoUploadingInfoMapper$mapModel$1.label = 3;
                        Object i8 = c.i(cVar, formattedText2, null, userPhotoUploadingInfoMapper$mapModel$1, 30);
                        if (i8 != coroutineSingletons) {
                            charSequence6 = charSequence;
                            obj = i8;
                            str5 = str3;
                            userPhotoStateResponse3 = userPhotoStateResponse2;
                            charSequence5 = (CharSequence) obj;
                            charSequence4 = charSequence6;
                            str4 = str5;
                            CharSequence charSequence82 = charSequence2;
                            String str82 = str2;
                            List list2 = userPhotoStateResponse3.e;
                            ArrayList arrayList2 = new ArrayList(tcc.n(list2, 10));
                            int i72 = 0;
                            while (r1.hasNext()) {
                            }
                            return new xq21(str4, str82, charSequence4, charSequence82, charSequence5, arrayList2);
                        }
                        return coroutineSingletons;
                    }
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    charSequence2 = (CharSequence) userPhotoUploadingInfoMapper$mapModel$1.L$5;
                    charSequence6 = (CharSequence) userPhotoUploadingInfoMapper$mapModel$1.L$4;
                    str2 = (String) userPhotoUploadingInfoMapper$mapModel$1.L$3;
                    str5 = (String) userPhotoUploadingInfoMapper$mapModel$1.L$2;
                    userPhotoStateResponse3 = (UserPhotoStateResponse) userPhotoUploadingInfoMapper$mapModel$1.L$0;
                    b.b(obj);
                    charSequence5 = (CharSequence) obj;
                    charSequence4 = charSequence6;
                    str4 = str5;
                    CharSequence charSequence822 = charSequence2;
                    String str822 = str2;
                    List list22 = userPhotoStateResponse3.e;
                    ArrayList arrayList22 = new ArrayList(tcc.n(list22, 10));
                    int i722 = 0;
                    for (Object obj2 : list22) {
                        int i9 = i722 + 1;
                        if (i722 < 0) {
                            Throwable th2 = th;
                            scc.m();
                            throw th2;
                        }
                        UserPhotoButtonDto userPhotoButtonDto = (UserPhotoButtonDto) obj2;
                        int i10 = i722 == scc.f(userPhotoStateResponse3.e) ? i5 : 0;
                        bq21 bq21Var = this.a;
                        pdc pdcVar = bq21Var.a;
                        Throwable th3 = th;
                        UserPhotoActionTypeDto userPhotoActionTypeDto = userPhotoButtonDto.c;
                        if (userPhotoActionTypeDto != null) {
                            int i11 = aq21.a[userPhotoActionTypeDto.ordinal()];
                            if (i11 == i5) {
                                userPhotoButtonAction = UserPhotoButtonAction.DELETE_PHOTO;
                            } else if (i11 == i4) {
                                userPhotoButtonAction = UserPhotoButtonAction.SELECT_PHOTO;
                            } else {
                                if (i11 != i3) {
                                    w511.b();
                                    return th3;
                                }
                                userPhotoButtonAction = UserPhotoButtonAction.TAKE_SELFIE;
                            }
                            UserPhotoButtonAction userPhotoButtonAction2 = userPhotoButtonAction;
                            if (userPhotoButtonAction2 != null) {
                                ufu ufuVar = (ufu) pdcVar;
                                arrayList22.add(new gq21(userPhotoButtonDto.a, userPhotoButtonDto.b, ufuVar.d(i10 != 0 ? (bdc) bq21Var.d.getValue() : (bdc) bq21Var.b.getValue(), userPhotoButtonDto.d), ufuVar.h((bdc) (i10 != 0 ? bq21Var.e.getValue() : bq21Var.c.getValue()), userPhotoButtonDto.e), userPhotoButtonAction2));
                                th = th3;
                                i722 = i9;
                                i3 = 3;
                                i4 = 2;
                                i5 = 1;
                            }
                        }
                        ny61.g("Unknown action in UserPhotoButtonDto");
                        return th3;
                    }
                    return new xq21(str4, str822, charSequence4, charSequence822, charSequence5, arrayList22);
                }
                String str9 = (String) userPhotoUploadingInfoMapper$mapModel$1.L$2;
                String str10 = (String) userPhotoUploadingInfoMapper$mapModel$1.L$1;
                UserPhotoStateResponse userPhotoStateResponse5 = (UserPhotoStateResponse) userPhotoUploadingInfoMapper$mapModel$1.L$0;
                b.b(obj);
                str = str10;
                str2 = str9;
                userPhotoStateResponse4 = userPhotoStateResponse5;
                str3 = str;
                charSequence = (CharSequence) obj;
                formattedText = userPhotoStateResponse4.b;
                if (formattedText == null) {
                    userPhotoUploadingInfoMapper$mapModel$1.L$0 = userPhotoStateResponse4;
                    userPhotoUploadingInfoMapper$mapModel$1.L$1 = null;
                    userPhotoUploadingInfoMapper$mapModel$1.L$2 = str3;
                    userPhotoUploadingInfoMapper$mapModel$1.L$3 = str2;
                    userPhotoUploadingInfoMapper$mapModel$1.L$4 = charSequence;
                    userPhotoUploadingInfoMapper$mapModel$1.label = 2;
                    Object i12 = c.i(cVar, formattedText, null, userPhotoUploadingInfoMapper$mapModel$1, 30);
                    if (i12 != coroutineSingletons) {
                        userPhotoStateResponse2 = userPhotoStateResponse4;
                        charSequence3 = charSequence;
                        obj = i12;
                        CharSequence charSequence72 = (CharSequence) obj;
                        charSequence = charSequence3;
                        charSequence2 = charSequence72;
                        formattedText2 = userPhotoStateResponse2.c;
                        if (formattedText2 == null) {
                        }
                    }
                    return coroutineSingletons;
                }
                userPhotoStateResponse2 = userPhotoStateResponse4;
                charSequence2 = null;
                formattedText2 = userPhotoStateResponse2.c;
                if (formattedText2 == null) {
                }
            }
        }
        userPhotoUploadingInfoMapper$mapModel$1 = new UserPhotoUploadingInfoMapper$mapModel$1(this, continuationImpl);
        Object obj3 = userPhotoUploadingInfoMapper$mapModel$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = userPhotoUploadingInfoMapper$mapModel$1.label;
        c cVar2 = this.b;
        int i32 = 3;
        int i42 = 2;
        Throwable th4 = null;
        int i52 = 1;
        if (i != 0) {
        }
        str3 = str;
        charSequence = (CharSequence) obj3;
        formattedText = userPhotoStateResponse4.b;
        if (formattedText == null) {
        }
    }
}
