package xsna;

import android.view.ViewGroup;
import com.vk.core.view.components.formitem.VkFormField;
import com.vk.core.view.components.formitem.VkInputSelect;
import com.vk.folders.impl.configure.h;
import com.vk.im.engine.models.dialogs.FolderType;
import com.vkontakte.android.R;
import java.util.Arrays;
import java.util.HashSet;

/* compiled from: FolderConfigurationNameInputVh.kt */
/* loaded from: classes18.dex */
public final class zxr extends vfz<xxr> {
    public final wxr l;
    public final VkFormField m;
    public final VkInputSelect n;
    public final HashSet<Long> o;
    public yxr p;

    public zxr(ViewGroup viewGroup, h.b bVar) {
        super(R.layout.vkim_folder_configuration_name_input_vh, viewGroup);
        this.l = bVar;
        this.m = (VkFormField) this.itemView.findViewById(R.id.vkim_form_layout);
        VkInputSelect vkInputSelect = (VkInputSelect) this.itemView.findViewById(R.id.vkim_name_input);
        vkInputSelect.setEmojiCompatEnabled(false);
        this.n = vkInputSelect;
        this.o = new HashSet<>();
        vkInputSelect.c(new wr0(17));
    }

    @Override // xsna.vfz
    public final void W5(xxr xxrVar) {
        xxr xxrVar2 = xxrVar;
        boolean z = xxrVar2.d;
        String str = xxrVar2.b;
        long j = xxrVar2.c;
        Long valueOf = Long.valueOf(j);
        HashSet<Long> hashSet = this.o;
        boolean contains = hashSet.contains(valueOf);
        VkInputSelect vkInputSelect = this.n;
        if (!contains) {
            vkInputSelect.setText(str);
            vkInputSelect.setSelection(str.length());
            hashSet.add(Long.valueOf(j));
        }
        VkFormField vkFormField = this.m;
        vkFormField.setError(z);
        if (z) {
            vkFormField.setError(String.format(this.itemView.getContext().getString(R.string.vkim_folder_configuration_name_length_alert_text), Arrays.copyOf(new Object[]{Integer.valueOf(xxrVar2.e)}, 1)));
        }
        yxr yxrVar = this.p;
        if (yxrVar != null) {
            vkInputSelect.e(yxrVar);
        }
        vkFormField.setDisabled(xxrVar2.f == FolderType.CHANNELS);
        yxr yxrVar2 = new yxr(this);
        this.p = yxrVar2;
        vkInputSelect.b(yxrVar2);
    }
}
