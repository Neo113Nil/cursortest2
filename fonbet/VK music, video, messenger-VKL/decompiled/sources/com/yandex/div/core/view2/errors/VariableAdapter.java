package com.yandex.div.core.view2.errors;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import androidx.recyclerview.widget.x;
import com.yandex.div.core.view2.errors.VariableAdapter;
import xsna.epx;
import xsna.izs;
import xsna.s3q0;
import xsna.yzs;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: VariableMonitorView.kt */
/* loaded from: classes7.dex */
public final class VariableAdapter extends x<VariableModel, VariableViewHolder> {
    private final yzs<String, String, String, s3q0> variableMutator;

    /* compiled from: VariableMonitorView.kt */
    public static final class VariableDiffUtilCallback extends m.e<VariableModel> {
        @Override // androidx.recyclerview.widget.m.e
        public boolean areContentsTheSame(VariableModel variableModel, VariableModel variableModel2) {
            return epx.f(variableModel.getValue(), variableModel2.getValue());
        }

        @Override // androidx.recyclerview.widget.m.e
        public boolean areItemsTheSame(VariableModel variableModel, VariableModel variableModel2) {
            return epx.f(variableModel.getName(), variableModel2.getName());
        }
    }

    /* compiled from: VariableMonitorView.kt */
    public static final class VariableViewHolder extends RecyclerView.e0 {
        private final VariableView root;
        private final yzs<String, String, String, s3q0> variableMutator;

        /* JADX WARN: Multi-variable type inference failed */
        public VariableViewHolder(VariableView variableView, yzs<? super String, ? super String, ? super String, s3q0> yzsVar) {
            super(variableView);
            this.root = variableView;
            this.variableMutator = yzsVar;
        }

        private final String fullName(VariableModel variableModel) {
            if (variableModel.getPath().length() <= 0) {
                return variableModel.getName();
            }
            return variableModel.getPath() + '/' + variableModel.getName();
        }

        private final int inputType(VariableModel variableModel) {
            String type = variableModel.getType();
            return epx.f(type, "number") ? true : epx.f(type, "integer") ? 2 : 1;
        }

        public final void bind(final VariableModel variableModel) {
            VariableView variableView = this.root;
            variableView.getNameText().setText(fullName(variableModel));
            variableView.getTypeText().setText(variableModel.getType());
            variableView.getValueText().setText(variableModel.getValue());
            variableView.getValueText().setInputType(inputType(variableModel));
            variableView.setOnEnterAction(new izs<String, s3q0>() { // from class: com.yandex.div.core.view2.errors.VariableAdapter$VariableViewHolder$bind$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // xsna.izs
                public /* bridge */ /* synthetic */ s3q0 invoke(String str) {
                    invoke2(str);
                    return s3q0.a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(String str) {
                    yzs yzsVar;
                    yzsVar = VariableAdapter.VariableViewHolder.this.variableMutator;
                    yzsVar.invoke(variableModel.getName(), variableModel.getPath(), str);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VariableAdapter(yzs<? super String, ? super String, ? super String, s3q0> yzsVar) {
        super(new VariableDiffUtilCallback());
        this.variableMutator = yzsVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(VariableViewHolder variableViewHolder, int i) {
        variableViewHolder.bind(getCurrentList().get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public VariableViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new VariableViewHolder(new VariableView(viewGroup.getContext()), this.variableMutator);
    }
}
