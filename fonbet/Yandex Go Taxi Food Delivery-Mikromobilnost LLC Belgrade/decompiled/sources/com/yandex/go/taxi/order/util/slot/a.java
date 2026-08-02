package com.yandex.go.taxi.order.util.slot;

import com.yandex.go.slot.dto.BadgeItemDto;
import defpackage.gdc;
import defpackage.kdc;
import defpackage.mqg0;
import defpackage.ndk0;
import defpackage.ny61;
import defpackage.qk4;
import defpackage.zuj0;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes14.dex */
public final class a {
    public final e a;
    public final ndk0 b;
    public final zuj0 c;

    public a(e eVar, ndk0 ndk0Var, zuj0 zuj0Var) {
        this.a = eVar;
        this.b = ndk0Var;
        this.c = zuj0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(BadgeItemDto.Text text, ContinuationImpl continuationImpl) {
        BadgeItemMapper$text$1 badgeItemMapper$text$1;
        int i;
        BadgeItemDto.Properties properties;
        kdc v;
        if (continuationImpl instanceof BadgeItemMapper$text$1) {
            badgeItemMapper$text$1 = (BadgeItemMapper$text$1) continuationImpl;
            int i2 = badgeItemMapper$text$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                badgeItemMapper$text$1.label = i2 - Integer.MIN_VALUE;
                Object obj = badgeItemMapper$text$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = badgeItemMapper$text$1.label;
                e eVar = this.a;
                if (i != 0) {
                    b.b(obj);
                    FormattedText formattedText = text.a;
                    badgeItemMapper$text$1.L$0 = text;
                    badgeItemMapper$text$1.label = 1;
                    obj = eVar.t(formattedText, badgeItemMapper$text$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    text = (BadgeItemDto.Text) badgeItemMapper$text$1.L$0;
                    b.b(obj);
                }
                CharSequence charSequence = (CharSequence) obj;
                properties = text.b;
                if (properties != null || (r0 = properties.a) == null) {
                    String b = text.a.b();
                }
                v = eVar.v(b);
                if (v == null) {
                    v = new gdc(mqg0.white);
                }
                BadgeItemDto.Properties properties2 = text.b;
                return new qk4(charSequence, v, eVar.a(properties2 != null ? properties2.b : null), charSequence);
            }
        }
        badgeItemMapper$text$1 = new BadgeItemMapper$text$1(this, continuationImpl);
        Object obj2 = badgeItemMapper$text$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = badgeItemMapper$text$1.label;
        e eVar2 = this.a;
        if (i != 0) {
        }
        CharSequence charSequence2 = (CharSequence) obj2;
        properties = text.b;
        if (properties != null) {
        }
        String b2 = text.a.b();
        v = eVar2.v(b2);
        if (v == null) {
        }
        BadgeItemDto.Properties properties22 = text.b;
        return new qk4(charSequence2, v, eVar2.a(properties22 != null ? properties22.b : null), charSequence2);
    }
}
