package defpackage;

import com.yandex.go.zone.dto.objects.ItemFill$LinearGradient;
import com.yandex.go.zone.dto.objects.ItemFill$Solid;
import com.yandex.go.zone.dto.objects.m2;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes8.dex */
public final class c2x extends xqt {
    public static final c2x e = new c2x();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, m2.INSTANCE.serializer(), qoi0.a(m2.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("solid", ItemFill$Solid.Companion.serializer(), qoi0.a(ItemFill$Solid.class)), new f9("linear_gradient", ItemFill$LinearGradient.Companion.serializer(), qoi0.a(ItemFill$LinearGradient.class)));
    }
}
