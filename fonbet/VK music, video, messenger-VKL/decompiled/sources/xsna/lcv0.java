package xsna;

import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.vk.search.models.VkPeopleSearchParams;
import com.vk.search.models.VkRelation;

/* compiled from: VkPeopleSearchParamsView.kt */
/* loaded from: classes5.dex */
public final class lcv0 extends teu0<VkPeopleSearchParams> {
    public TextView h;
    public TextView i;
    public TextView j;
    public Spinner k;
    public Spinner l;
    public Spinner m;

    public static s3q0 d(lcv0 lcv0Var) {
        lcv0Var.setGender(0);
        return s3q0.a;
    }

    public static s3q0 e(lcv0 lcv0Var) {
        lcv0Var.setGender(1);
        return s3q0.a;
    }

    public static s3q0 f(lcv0 lcv0Var) {
        lcv0Var.setGender(2);
        return s3q0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAgeFrom(int i) {
        Spinner spinner;
        if (getBlockChanges()) {
            return;
        }
        getSearchParams().e = i;
        if (getSearchParams().f < getSearchParams().e && getSearchParams().f > 0 && (spinner = this.l) != null) {
            spinner.setSelection(getSearchParams().e - 13);
        }
        Spinner spinner2 = this.k;
        if (spinner2 != null) {
            spinner2.setSelected(getSearchParams().e != 0);
        }
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAgeTo(int i) {
        Spinner spinner;
        if (getBlockChanges()) {
            return;
        }
        getSearchParams().f = i;
        if (getSearchParams().e > getSearchParams().f && getSearchParams().f > 0 && (spinner = this.k) != null) {
            spinner.setSelection(getSearchParams().f - 13);
        }
        Spinner spinner2 = this.l;
        if (spinner2 != null) {
            spinner2.setSelected(getSearchParams().f != 0);
        }
        c();
    }

    private final void setGender(int i) {
        SpinnerAdapter adapter;
        if (getBlockChanges()) {
            return;
        }
        getSearchParams().d = i;
        TextView textView = this.h;
        if (textView != null) {
            textView.setSelected(i == 0);
        }
        TextView textView2 = this.i;
        if (textView2 != null) {
            textView2.setSelected(i == 2);
        }
        TextView textView3 = this.j;
        if (textView3 != null) {
            textView3.setSelected(i == 1);
        }
        Spinner spinner = this.m;
        if (spinner != null && (adapter = spinner.getAdapter()) != null) {
            wfv0 wfv0Var = (wfv0) adapter;
            boolean z = i != 1;
            if (wfv0Var.b != z) {
                wfv0Var.b = z;
                wfv0Var.notifyDataSetChanged();
            }
        }
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setRelationship(VkRelation vkRelation) {
        if (getBlockChanges()) {
            return;
        }
        VkPeopleSearchParams searchParams = getSearchParams();
        if (vkRelation == null) {
            VkRelation vkRelation2 = VkPeopleSearchParams.h;
            vkRelation = VkPeopleSearchParams.h;
        }
        searchParams.g = vkRelation;
        Spinner spinner = this.m;
        if (spinner != null) {
            VkRelation vkRelation3 = getSearchParams().g;
            VkRelation vkRelation4 = VkPeopleSearchParams.h;
            spinner.setSelected(vkRelation3 != VkPeopleSearchParams.h);
        }
        c();
    }

    @Override // xsna.teu0
    public final void a(VkPeopleSearchParams vkPeopleSearchParams) {
        VkPeopleSearchParams vkPeopleSearchParams2 = vkPeopleSearchParams;
        super.a(vkPeopleSearchParams2);
        setGender(vkPeopleSearchParams2.d);
        int i = vkPeopleSearchParams2.e;
        if (i < 14 || i > 80) {
            Spinner spinner = this.k;
            if (spinner != null) {
                spinner.setSelection(0);
            }
        } else {
            Spinner spinner2 = this.k;
            if (spinner2 != null) {
                spinner2.setSelection(i - 13);
            }
        }
        int i2 = vkPeopleSearchParams2.f;
        if (i2 < 14 || i2 > 80) {
            Spinner spinner3 = this.l;
            if (spinner3 != null) {
                spinner3.setSelection(0);
            }
        } else {
            Spinner spinner4 = this.l;
            if (spinner4 != null) {
                spinner4.setSelection(i2 - 13);
            }
        }
        Spinner spinner5 = this.m;
        if (spinner5 != null) {
            VkRelation vkRelation = vkPeopleSearchParams2.g;
            if (vkRelation != null) {
                SpinnerAdapter adapter = spinner5.getAdapter();
                int count = adapter.getCount();
                int i3 = 0;
                while (true) {
                    if (i3 >= count) {
                        spinner5.setSelection(0);
                        break;
                    } else {
                        if (vkRelation.equals(adapter.getItem(i3))) {
                            spinner5.setSelection(i3);
                            break;
                        }
                        i3++;
                    }
                }
            } else {
                spinner5.setSelection(0);
            }
        }
        c();
    }
}
