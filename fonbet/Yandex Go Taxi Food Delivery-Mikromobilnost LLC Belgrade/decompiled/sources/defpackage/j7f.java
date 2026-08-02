package defpackage;

import android.view.inputmethod.InputMethodManager;
import androidx.emoji2.widget.EmojiEditText;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;

/* loaded from: classes15.dex */
public final /* synthetic */ class j7f implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ k7f b;

    public /* synthetic */ j7f(k7f k7fVar, int i) {
        this.a = i;
        this.b = k7fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
    @Override // defpackage.tls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        fl2 fl2Var;
        RecyclerView recyclerView;
        int i = this.a;
        fl2 fl2Var2 = null;
        zy11 zy11Var = zy11.a;
        k7f k7fVar = this.b;
        switch (i) {
            case 0:
                t7f t7fVar = k7fVar.a;
                t7fVar.h = (String) obj;
                t7fVar.e();
                break;
            case 1:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                t7f t7fVar2 = k7fVar.a;
                t7fVar2.j = booleanValue;
                t7fVar2.e();
                break;
            case 2:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                t7f t7fVar3 = k7fVar.a;
                t7fVar3.i = booleanValue2;
                t7fVar3.e();
                break;
            case 3:
                boolean booleanValue3 = ((Boolean) obj).booleanValue();
                t7f t7fVar4 = k7fVar.a;
                t7fVar4.k = booleanValue3;
                t7fVar4.e();
                break;
            case 4:
                boolean booleanValue4 = ((Boolean) obj).booleanValue();
                t7f t7fVar5 = k7fVar.a;
                t7fVar5.l = booleanValue4;
                t7fVar5.e();
                break;
            case 5:
                int intValue = ((Integer) obj).intValue();
                RecyclerView recyclerView2 = k7fVar.b;
                if (recyclerView2 != null) {
                    x0 findViewHolderForAdapterPosition = recyclerView2.findViewHolderForAdapterPosition(intValue - 1);
                    if (findViewHolderForAdapterPosition instanceof fl2) {
                        fl2Var2 = (fl2) findViewHolderForAdapterPosition;
                    }
                }
                if (fl2Var2 != null) {
                    fl2Var2.s();
                }
                t7f t7fVar6 = k7fVar.a;
                t7fVar6.m.remove(intValue - 1);
                t7fVar6.d();
                break;
            case 6:
                int intValue2 = ((Integer) obj).intValue();
                RecyclerView recyclerView3 = k7fVar.b;
                if (recyclerView3 != null) {
                    x0 findViewHolderForAdapterPosition2 = recyclerView3.findViewHolderForAdapterPosition(intValue2);
                    if (findViewHolderForAdapterPosition2 instanceof fl2) {
                        fl2Var = (fl2) findViewHolderForAdapterPosition2;
                        recyclerView = k7fVar.b;
                        if (recyclerView != null) {
                            x0 findViewHolderForAdapterPosition3 = recyclerView.findViewHolderForAdapterPosition(intValue2 + 1);
                            if (findViewHolderForAdapterPosition3 instanceof fl2) {
                                fl2Var2 = (fl2) findViewHolderForAdapterPosition3;
                            }
                        }
                        if (fl2Var2 != null) {
                            if (!t7f.a(k7fVar.a)) {
                                if (fl2Var != null) {
                                    fl2Var.P.clearFocus();
                                }
                                if (fl2Var != null) {
                                    EmojiEditText emojiEditText = fl2Var.P;
                                    ((InputMethodManager) emojiEditText.getContext().getSystemService("input_method")).hideSoftInputFromWindow(emojiEditText.getWindowToken(), 0);
                                    break;
                                }
                            } else {
                                k7fVar.c = Integer.valueOf(intValue2 + 1);
                                break;
                            }
                        } else {
                            fl2Var2.s();
                            break;
                        }
                    }
                }
                fl2Var = null;
                recyclerView = k7fVar.b;
                if (recyclerView != null) {
                }
                if (fl2Var2 != null) {
                }
                break;
            default:
                Integer num = (Integer) obj;
                num.getClass();
                if (t7f.a(k7fVar.a)) {
                    k7fVar.c = num;
                    break;
                }
                break;
        }
        return zy11Var;
    }
}
