package defpackage;

import androidx.compose.runtime.internal.a;
import androidx.compose.ui.tooling.ComposeViewAdapter;
import com.yandex.go.design.compose.slot.SlotSize;
import ru.yandex.taxi.logistics.sdk.delivery_screen_smart_camera.impl.ui.smart_camera_entry_point.slime.b;

/* loaded from: classes5.dex */
public final /* synthetic */ class om9 implements wls {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ int x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ om9(long j, ComposeViewAdapter composeViewAdapter, Class cls, String str, String str2, Class cls2, int i) {
        this.b = j;
        this.y = composeViewAdapter;
        this.z = cls;
        this.c = str;
        this.w = str2;
        this.A = cls2;
        this.x = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        zy11 init$lambda$2$0;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.x;
        Object obj3 = this.A;
        Object obj4 = this.w;
        Object obj5 = this.c;
        Object obj6 = this.z;
        Object obj7 = this.y;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int O = vng.O(i2 | 1);
                pm9.a((f530) obj7, (CharSequence) obj6, (String) obj5, this.b, (String) obj4, (SlotSize) obj3, (fid) obj, O);
                break;
            case 1:
                int intValue = ((Integer) obj2).intValue();
                init$lambda$2$0 = ComposeViewAdapter.init$lambda$2$0(this.b, (ComposeViewAdapter) obj7, (Class) obj6, (String) obj5, (String) obj4, (Class) obj3, this.x, (fid) obj, intValue);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int O2 = vng.O(i2 | 1);
                tt91.b(this.b, (String) obj5, (a) obj6, (f530) obj7, (fqm) obj3, (String) obj4, (fid) obj, O2);
                break;
            default:
                ((Integer) obj2).getClass();
                int O3 = vng.O(i2 | 1);
                b.a((f530) obj7, (lvi0) obj6, this.b, (sls) obj5, (Long) obj4, (lxy0) obj3, (fid) obj, O3);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ om9(long j, String str, a aVar, f530 f530Var, fqm fqmVar, String str2, int i) {
        this.b = j;
        this.c = str;
        this.z = aVar;
        this.y = f530Var;
        this.A = fqmVar;
        this.w = str2;
        this.x = i;
    }

    public /* synthetic */ om9(f530 f530Var, lvi0 lvi0Var, long j, sls slsVar, Long l, lxy0 lxy0Var, int i) {
        this.y = f530Var;
        this.z = lvi0Var;
        this.b = j;
        this.c = slsVar;
        this.w = l;
        this.A = lxy0Var;
        this.x = i;
    }

    public /* synthetic */ om9(f530 f530Var, CharSequence charSequence, String str, long j, String str2, SlotSize slotSize, int i) {
        this.y = f530Var;
        this.z = charSequence;
        this.c = str;
        this.b = j;
        this.w = str2;
        this.A = slotSize;
        this.x = i;
    }
}
