package xsna;

import android.app.Activity;
import android.content.ContentUris;
import android.content.Intent;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.vk.catalog.mvi.block.impl.slider.SliderView;
import com.vk.location.common.LocationCommon;
import com.vk.toggle.b;
import com.vkontakte.android.R;
import xsna.equ0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class j1k0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ j1k0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        equ0.b bVar;
        xqm xqmVar;
        switch (this.b) {
            case 0:
                ((izs) this.c).invoke(new SliderView.b.C0452b(((SliderView.f) this.d).b));
                break;
            case 1:
                break;
            case 2:
                t3m0 t3m0Var = (t3m0) this.c;
                c4m0 c4m0Var = (c4m0) this.d;
                o3m0 presenter = t3m0Var.getPresenter();
                if (presenter != null) {
                    Activity activity = c4m0Var.b;
                    LocationCommon.a.getClass();
                    presenter.Z0(LocationCommon.b(activity) && LocationCommon.a(activity));
                }
                break;
            case 3:
                b.d dVar = (b.d) this.c;
                b.d dVar2 = (b.d) this.d;
                break;
            case 4:
                gzs gzsVar = (gzs) this.c;
                ((wh50) this.d).setValue(new tho0("", 0L, 6));
                gzsVar.invoke();
                break;
            case 5:
                pqr0 pqr0Var = (pqr0) this.c;
                i0b i0bVar = (i0b) this.d;
                pqr0Var.m.y0(i0bVar.getId(), i0bVar instanceof lcf0);
                break;
            case 6:
                Toolbar toolbar = (Toolbar) this.c;
                gqu0 gqu0Var = (gqu0) this.d;
                View findViewById = toolbar.findViewById(R.id.call);
                if (findViewById != null && gqu0Var.g && (bVar = gqu0Var.d) != null && (xqmVar = equ0.this.l) != null) {
                    xqmVar.f(findViewById);
                }
                break;
            default:
                oyw0 oyw0Var = (oyw0) this.c;
                yyl0 yyl0Var = (yyl0) this.d;
                f1x0 f1x0Var = oyw0Var.d;
                Intent data = f1x0Var.g != null ? new Intent("android.intent.action.EDIT").setData(ContentUris.withAppendedId(CalendarContract.Events.CONTENT_URI, f1x0Var.g.longValue())) : new Intent("android.intent.action.INSERT").setData(CalendarContract.Events.CONTENT_URI);
                Bundle bundle = new Bundle();
                bundle.putString("title", f1x0Var.a);
                bundle.putString("description", f1x0Var.b);
                bundle.putBoolean("allDay", f1x0Var.d);
                bundle.putLong("beginTime", f1x0Var.e);
                bundle.putLong("endTime", f1x0Var.f);
                bundle.putString("rrule", f1x0Var.c);
                Intent createChooser = Intent.createChooser(data.putExtras(bundle), oyw0Var.a.getString(R.string.share));
                if (createChooser != null) {
                    yyl0Var.invoke(createChooser);
                }
                break;
        }
        return s3q0.a;
    }
}
