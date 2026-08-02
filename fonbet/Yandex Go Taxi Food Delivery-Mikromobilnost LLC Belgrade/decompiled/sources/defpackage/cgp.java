package defpackage;

import com.yandex.go.address.models.FavoriteAddress;
import kotlin.Metadata;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lcgp;", "Ll050;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface cgp extends l050 {
    void applyThemeType(ThemeType themeType);

    void changeAddressOnMap(zzs zzsVar);

    void handleDeleteError(Throwable th);

    void handleSaveError(Throwable th);

    egp inputsHolder();

    void onAddressAdded(FavoriteAddress favoriteAddress);

    void onAddressRemoved(FavoriteAddress favoriteAddress);

    void onAddressUpdated(String str, FavoriteAddress favoriteAddress);

    void onBack();

    void onPickedAddress(FavoriteAddress favoriteAddress);

    void render(bgp bgpVar);

    void renderHeader(CharSequence charSequence, CharSequence charSequence2);

    void renderInputs(kgp kgpVar);

    void renderMapImage(nj00 nj00Var);

    void requestFocusOnSelectAsDestinationButton();

    void setScreenTitle(String str);

    void setShimmerLoading(boolean z);

    void showActiveOrderError();

    void showAddressSearchModal();

    void showDeleteButton();

    void showDeleteDialog(Runnable runnable);

    void showDeleteLoading();

    void showHouseMissingDialog();

    void showLoading();

    void showSaveButton();

    void showSetAsDestinationButton();

    void stopDeleteLoading();

    void stopLoading();

    void updateAddressItem(String str, String str2, String str3);
}
