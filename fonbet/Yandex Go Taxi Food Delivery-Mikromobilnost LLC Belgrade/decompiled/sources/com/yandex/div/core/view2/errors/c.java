package com.yandex.div.core.view2.errors;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.x0;
import androidx.recyclerview.widget.y;
import defpackage.d231;
import defpackage.j231;
import defpackage.tls;
import defpackage.zls;
import defpackage.zy11;

/* loaded from: classes11.dex */
public final class c extends y {
    public final zls a;

    public c(zls zlsVar) {
        super(new d231());
        this.a = zlsVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i) {
        final b bVar = (b) x0Var;
        final j231 j231Var = (j231) getCurrentList().get(i);
        VariableView variableView = bVar.N;
        TextView nameText = variableView.getNameText();
        String str = j231Var.b;
        String str2 = j231Var.c;
        String str3 = j231Var.a;
        if (str.length() > 0) {
            str3 = j231Var.b + '/' + str3;
        }
        nameText.setText(str3);
        variableView.getTypeText().setText(str2);
        variableView.getValueText().setText(j231Var.d);
        variableView.getValueText().setInputType(str2.equals("number") ? true : str2.equals("integer") ? 2 : 1);
        variableView.setOnEnterAction(new tls() { // from class: com.yandex.div.core.view2.errors.VariableAdapter$VariableViewHolder$bind$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                zls zlsVar = b.this.O;
                j231 j231Var2 = j231Var;
                zlsVar.invoke(j231Var2.a, j231Var2.b, (String) obj);
                return zy11.a;
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new b(new VariableView(viewGroup.getContext()), this.a);
    }
}
