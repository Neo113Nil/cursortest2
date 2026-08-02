package xsna;

import android.content.Context;
import android.view.View;
import android.widget.PopupWindow;
import com.vk.emoji.RecyclerAutofitGridView;
import com.vk.emoji.a;
import java.util.ArrayList;
import java.util.NoSuchElementException;

/* compiled from: EmojiItemHolder.kt */
/* loaded from: classes18.dex */
public final class odp extends kdp implements View.OnClickListener, View.OnLongClickListener {
    public final o9f0 l;
    public final iep m;
    public final qdp n;
    public final rdp o;
    public mep p;
    public String q;

    public odp(Context context, o9f0 o9f0Var, iep iepVar, a.C1024a c1024a) {
        super(new rdp(context));
        this.l = o9f0Var;
        this.m = iepVar;
        this.n = c1024a;
        rdp rdpVar = (rdp) this.itemView;
        this.o = rdpVar;
        this.q = "";
        rdpVar.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.l.a(this.p.a);
        String str = this.q;
        sdp sdpVar = com.vk.emoji.a.this.g;
        if (sdpVar != null) {
            sdpVar.b(str);
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        String[][] strArr;
        mep mepVar = this.p;
        int layoutPosition = getLayoutPosition();
        a.C1024a c1024a = (a.C1024a) this.n;
        c1024a.getClass();
        if (mepVar == null || (strArr = mepVar.b) == null) {
            return true;
        }
        com.vk.emoji.a aVar = com.vk.emoji.a.this;
        aVar.x0();
        kep kepVar = new kep(view.getContext());
        o9f0 o9f0Var = aVar.e;
        kepVar.d = strArr;
        if (strArr.length == 0) {
            throw new NoSuchElementException();
        }
        int length = strArr[0].length;
        int length2 = strArr.length - 1;
        if (1 <= length2) {
            int i = 1;
            while (true) {
                int length3 = strArr[i].length;
                if (length < length3) {
                    length = length3;
                }
                if (i == length2) {
                    break;
                }
                i++;
            }
        }
        kepVar.g = length;
        jep jepVar = new jep(kepVar.getContext(), o9f0Var, kepVar.f);
        kepVar.c = jepVar;
        RecyclerAutofitGridView recyclerAutofitGridView = kepVar.b;
        recyclerAutofitGridView.setAdapter(jepVar);
        recyclerAutofitGridView.setDefaultColumns(kepVar.g);
        jep jepVar2 = kepVar.c;
        if (jepVar2 != null) {
            int i2 = kepVar.g;
            ArrayList<String> arrayList = jepVar2.f;
            arrayList.clear();
            for (String[] strArr2 : strArr) {
                ArrayList arrayList2 = new ArrayList();
                rl3.p0(strArr2, arrayList2);
                while (arrayList2.size() < i2) {
                    arrayList2.add("");
                }
                arrayList.addAll(arrayList2);
            }
            int length4 = i2 * strArr.length;
            jepVar2.g = length4;
            jepVar2.notifyItemRangeChanged(0, length4);
        }
        kepVar.setListener(new wcp(aVar, mepVar, layoutPosition));
        int height = view.getHeight();
        PopupWindow popupWindow = new PopupWindow(kepVar, -2, -2);
        aVar.j = popupWindow;
        popupWindow.setOutsideTouchable(true);
        aVar.j.setFocusable(false);
        aVar.j.setBackgroundDrawable(null);
        aVar.j.setElevation(k46.a(aVar.c, 5.0f));
        int rowsCount = kepVar.getRowsCount();
        int columnsCount = kepVar.getColumnsCount();
        int padding = kepVar.getPadding();
        ucp ucpVar = ucp.a;
        aVar.i = ucp.a().subscribe(new bn3(kepVar, 25));
        float f = padding;
        aVar.j.showAsDropDown(view, (int) (((-((columnsCount / 2.0f) - 0.5f)) * height) - f), (int) ((((-height) * 1.5f) - (rowsCount * height)) - f));
        return true;
    }
}
