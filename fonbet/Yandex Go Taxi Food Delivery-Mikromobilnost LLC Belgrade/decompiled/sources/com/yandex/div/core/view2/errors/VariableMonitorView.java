package com.yandex.div.core.view2.errors;

import android.content.Context;
import android.graphics.Color;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a231;
import defpackage.bh11;
import defpackage.c231;
import defpackage.j231;
import defpackage.scc;
import defpackage.t131;
import defpackage.tcc;
import defpackage.tls;
import defpackage.u131;
import defpackage.v131;
import defpackage.w131;
import defpackage.w511;
import defpackage.x131;
import defpackage.y131;
import defpackage.z131;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0017\u001a\u00020\u00162\u0018\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00140\u00130\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u000e\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/yandex/div/core/view2/errors/VariableMonitorView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Lcom/yandex/div/core/view2/errors/d;", "variableMonitor", "<init>", "(Landroid/content/Context;Lcom/yandex/div/core/view2/errors/d;)V", "createTableTitle", "()Landroid/widget/LinearLayout;", "Landroidx/recyclerview/widget/RecyclerView;", "createTable", "()Landroidx/recyclerview/widget/RecyclerView;", "", "title", "Landroid/widget/TextView;", "createCellTitle", "(Ljava/lang/String;)Landroid/widget/TextView;", "", "Lkotlin/Pair;", "Lc231;", "newList", "Lzy11;", "updateTable", "(Ljava/util/List;)V", "Landroid/content/Context;", "Lcom/yandex/div/core/view2/errors/c;", "variablesAdapter", "Lcom/yandex/div/core/view2/errors/c;", "Landroid/widget/LinearLayout;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class VariableMonitorView extends LinearLayout {
    private final Context context;
    private final LinearLayout title;
    private final c variablesAdapter;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.yandex.div.core.view2.errors.VariableMonitorView$1, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements tls {
        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            ((VariableMonitorView) this.receiver).updateTable((List) obj);
            return zy11.a;
        }
    }

    public VariableMonitorView(Context context, d dVar) {
        super(context);
        this.context = context;
        this.variablesAdapter = new c(new VariableMonitorView$variablesAdapter$1(3, dVar, d.class, "mutateVariable", "mutateVariable(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", 0));
        LinearLayout createTableTitle = createTableTitle();
        this.title = createTableTitle;
        setOrientation(1);
        dVar.c = new AnonymousClass1(1, this, VariableMonitorView.class, "updateTable", "updateTable(Ljava/util/List;)V", 0);
        dVar.a();
        addView(createTableTitle, new LinearLayout.LayoutParams(-1, -2));
        addView(createTable(), new LinearLayout.LayoutParams(-1, -2));
    }

    private final TextView createCellTitle(String title) {
        TextView textView = new TextView(this.context);
        int p = com.yandex.div.core.view2.divs.a.p(8, textView.getResources().getDisplayMetrics());
        textView.setPadding(p, p, p, p);
        textView.setTextColor(-1);
        textView.setText(title);
        textView.setTypeface(textView.getTypeface(), 1);
        return textView;
    }

    private final RecyclerView createTable() {
        RecyclerView recyclerView = new RecyclerView(this.context);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(this.variablesAdapter);
        recyclerView.setBackgroundColor(Color.argb(50, 0, 0, 0));
        return recyclerView;
    }

    private final LinearLayout createTableTitle() {
        LinearLayout linearLayout = new LinearLayout(this.context);
        List g = scc.g(200, 60, 100);
        List g2 = scc.g("name", "type", "value");
        ArrayList arrayList = new ArrayList(tcc.n(g2, 10));
        Iterator it = g2.iterator();
        while (it.hasNext()) {
            arrayList.add(createCellTitle((String) it.next()));
        }
        Iterator it2 = kotlin.collections.a.P0(arrayList, g).iterator();
        while (it2.hasNext()) {
            Pair pair = (Pair) it2.next();
            linearLayout.addView((TextView) pair.getFirst(), new LinearLayout.LayoutParams(com.yandex.div.core.view2.divs.a.p(Integer.valueOf(((Number) pair.getSecond()).intValue()), linearLayout.getResources().getDisplayMetrics()), -2));
        }
        return linearLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateTable(List<? extends Pair<String, ? extends c231>> newList) {
        String str;
        c cVar = this.variablesAdapter;
        List<? extends Pair<String, ? extends c231>> list = newList;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str2 = (String) pair.getFirst();
            c231 c231Var = (c231) pair.getSecond();
            String c = c231Var.c();
            if (c231Var instanceof t131) {
                str = "array";
            } else if (c231Var instanceof u131) {
                str = "boolean";
            } else if (c231Var instanceof v131) {
                str = "color";
            } else if (c231Var instanceof w131) {
                str = "dict";
            } else if (c231Var instanceof x131) {
                str = "number";
            } else if (c231Var instanceof y131) {
                str = "integer";
            } else if (c231Var instanceof z131) {
                str = "string";
            } else if (c231Var instanceof a231) {
                str = "url";
            } else {
                if (!(c231Var instanceof com.yandex.div.data.a)) {
                    w511.b();
                    return;
                }
                str = "property";
            }
            arrayList.add(new j231(c, str2, str, c231Var.d().toString()));
        }
        cVar.submitList(arrayList, new bh11(15, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateTable$lambda$5(VariableMonitorView variableMonitorView) {
        variableMonitorView.title.setVisibility(variableMonitorView.variablesAdapter.getItemCount() != 0 ? 0 : 8);
    }
}
