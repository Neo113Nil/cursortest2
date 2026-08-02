package defpackage;

import android.util.AttributeSet;
import java.io.IOException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import okhttp3.internal.http2.ErrorCode;
import ru.yandex.taxi.design.ListItemWithBadgeComponent;
import ru.yandex.taxi.design.SwitchComponent;

/* loaded from: classes9.dex */
public final /* synthetic */ class i4o implements sls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public /* synthetic */ i4o(int i, String str, j4o j4oVar) {
        this.b = i;
        this.c = str;
        this.w = j4oVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        SwitchComponent switchComponent;
        int i = this.a;
        int i2 = this.b;
        Object obj = this.w;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                String str = (String) obj2;
                j4o j4oVar = (j4o) obj;
                SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[i2];
                for (int i3 = 0; i3 < i2; i3++) {
                    serialDescriptorArr[i3] = d6z.i(str + '.' + j4oVar.e[i3], ovu0.j, new SerialDescriptor[0]);
                }
                return serialDescriptorArr;
            case 1:
                euu euuVar = (euu) obj2;
                try {
                    euuVar.P.o(i2, (ErrorCode) obj);
                } catch (IOException e) {
                    ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
                    euuVar.a(errorCode, errorCode, e);
                }
                return zy11.a;
            default:
                switchComponent = ListItemWithBadgeComponent.toggleLazy$lambda$0((ListItemWithBadgeComponent) obj2, (AttributeSet) obj, i2);
                return switchComponent;
        }
    }

    public /* synthetic */ i4o(euu euuVar, int i, ErrorCode errorCode) {
        this.c = euuVar;
        this.b = i;
        this.w = errorCode;
    }

    public /* synthetic */ i4o(ListItemWithBadgeComponent listItemWithBadgeComponent, AttributeSet attributeSet, int i) {
        this.c = listItemWithBadgeComponent;
        this.w = attributeSet;
        this.b = i;
    }
}
