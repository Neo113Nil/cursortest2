package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.serialize.Serializer;
import com.vk.core.serialize.Serializer.StreamParcelable;
import xsna.vif0;

/* compiled from: AttachPickerInterfaces.kt */
/* loaded from: classes15.dex */
public interface txt0<T extends Serializer.StreamParcelable, VH extends vif0<T>> {
    vif0 Cl(ViewGroup viewGroup, zom0 zom0Var);

    default RecyclerView.e0 bn(ViewGroup viewGroup) {
        return null;
    }
}
